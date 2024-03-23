package com.ruoyi.system.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.huaSheng.GameData;
import com.ruoyi.system.mapper.GameDataMapper;
import org.apache.poi.hssf.record.DVALRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 游戏性能Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-21
 */
@Service
public class GameDataServiceImpl implements IGameDataService
{
    @Autowired
    private GameDataMapper gameDataMapper;

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
}
