package com.ruoyi.system.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.common.utils.file.FileUtils;
import com.ruoyi.system.domain.huaSheng.GameData;
import com.ruoyi.system.domain.huaSheng.GamePictureRequest;
import com.ruoyi.system.mapper.GameDataMapper;
import com.ruoyi.system.service.IGameDataService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;


/**
 * 游戏性能Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-21
 */
@Service
@Slf4j
public class GameDataServiceImpl implements IGameDataService
{
    @Autowired
    private GameDataMapper gameDataMapper;

    @Autowired
    RuoYiConfig ruoYiConfig;
    /**
     * 查询游戏性能
     *
     * @param id 游戏性能主键
     * @return 游戏性能
     */
    @Override
    public GameData selectGameDataById(Long id)
    {
        return gameDataMapper.selectGameDataById(id);
    }

    /**
     * 查询游戏性能列表
     *
     * @param gameData 游戏性能
     * @return 游戏性能
     */
    @Override
    public List<GameData> selectGameDataList(GameData gameData)
    {
        return gameDataMapper.selectGameDataList(gameData);
    }

    /**
     * 新增游戏性能
     *
     * @param gameData 游戏性能
     * @return 结果
     */
    @Override
    public AjaxResult insertGameData(GameData gameData)
    {
        //查询同型号手机的同一个游戏数据是否存在
        int res = gameDataMapper.selectGameInfoByMobileName(gameData.getModelId(), gameData.getGameId());
        if(res>0){
            return AjaxResult.error("该手机已经录入过此游戏数据,请勿重复录入");
        }
        gameData.setCreationDate(DateUtils.getNowDate());
        gameDataMapper.insertGameData(gameData);
        return AjaxResult.success();
    }

    /**
     * 修改游戏性能
     *
     * @param gameData 游戏性能
     * @return 结果
     */
    @Override
    public int updateGameData(GameData gameData)
    {
        gameData.setUpdateDate(DateUtils.getNowDate());
        return gameDataMapper.updateGameData(gameData);
    }

    /**
     * 批量删除游戏性能
     *
     * @param ids 需要删除的游戏性能主键
     * @return 结果
     */
    @Override
    public int deleteGameDataByIds(Long[] ids)
    {
        return gameDataMapper.deleteGameDataByIds(ids);
    }

    /**
     * 删除游戏性能信息
     *
     * @param id 游戏性能主键
     * @return 结果
     */
    @Override
    public int deleteGameDataById(Long id)
    {
        return gameDataMapper.deleteGameDataById(id);
    }

    @Override
    public byte[] downLoadPicture(HttpServletResponse response, GamePictureRequest request) {
        String profile = RuoYiConfig.getProfile();
        String ratePath=null;
        String power=null;
        String temperatureBack=null;
        String temperatureSide=null;
        String temperatureFront=null;
        Map<String,String> map=new HashMap<>();
        if(StringUtils.isNotEmpty(request.getFrameRateImageUrl())){
           ratePath = profile + request.getFrameRateImageUrl().substring(8);
            map.put("帧率",ratePath);
        }
        if(StringUtils.isNotEmpty(request.getPowerConsumptionImageUrl())){
            power = profile + request.getPowerConsumptionImageUrl().substring(8);
            map.put("功耗",power);
        }
        if(StringUtils.isNotEmpty(request.getTemperatureBackImageUrl())){
            temperatureBack = profile + request.getTemperatureBackImageUrl().substring(8);
            map.put("背面温度",temperatureBack);
        }
        if(StringUtils.isNotEmpty(request.getTemperatureSideImageUrl())){
            temperatureSide = profile + request.getTemperatureSideImageUrl().substring(8);
            map.put("侧面温度",temperatureSide);
        }
        if(StringUtils.isNotEmpty(request.getTemperatureFrontImageUrl())){
            temperatureFront = profile + request.getTemperatureFrontImageUrl().substring(8);
            map.put("正面温度",temperatureFront);
        }
        if(ObjectUtils.isEmpty(map)){
            return null;
        }
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);
        map.forEach((key, value)->{
            generatorCode(value,key,zip);
        });
        IOUtils.closeQuietly(zip);
        return outputStream.toByteArray();
    }


    private void generatorCode(String picturePath,String name, ZipOutputStream zip)
    {
        int begin = org.apache.commons.lang3.StringUtils.indexOf(FileUtils.getName(picturePath), ".");
        String fileName = name.concat(FileUtils.getName(picturePath).substring(begin));
        try{
            // 转换为Path对象
            Path path = Paths.get(picturePath);
            // 读取文件内容到字节数组
            byte[] fileContentBytes = Files.readAllBytes(path);
            // 添加到zip
            zip.putNextEntry(new ZipEntry(fileName));
            IOUtils.write(fileContentBytes, zip);
            zip.flush();
            zip.closeEntry();
        }
        catch (IOException e)
        {
            log.error("下载图片失败：" + fileName, e);
        }
    }
}
