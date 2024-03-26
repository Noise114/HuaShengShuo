package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.huaSheng.MobileBasicData;
import com.ruoyi.system.mapper.EnduranceMapper;
import com.ruoyi.system.mapper.GameDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.MobileBasicDataMapper;
import com.ruoyi.system.service.IMobileBasicDataService;

/**
 * 【手机基础信息】Service业务层处理
 *
 * @author noise
 * @date 2024-03-19
 */
@Service
public class MobileBasicDataServiceImpl implements IMobileBasicDataService
{
    @Autowired
    private MobileBasicDataMapper mobileBasicDataMapper;
    @Autowired
    private EnduranceMapper enduranceMapper;
    @Autowired
    private GameDataMapper gameDataMapper;
    /**
     * 查询【手机基础信息】
     *
     * @param modelId 【手机基础信息】主键
     * @return 【手机基础信息】
     */
    @Override
    public MobileBasicData selectMobileBasicDataByModelId(Long modelId)
    {
        return mobileBasicDataMapper.selectMobileBasicDataByModelId(modelId);
    }

    /**
     * 查询【手机基础信息】列表
     *
     * @param mobileBasicData 【手机基础信息】
     * @return 【手机基础信息】
     */
    @Override
    public List<MobileBasicData> selectMobileBasicDataList(MobileBasicData mobileBasicData)
    {
        return mobileBasicDataMapper.selectMobileBasicDataList(mobileBasicData);
    }

    /**
     * 新增【手机基础信息】
     *
     * @param mobileBasicData 【手机基础信息】
     * @return 结果
     */
    @Override
    public AjaxResult insertMobileBasicData(MobileBasicData mobileBasicData)
    {
        mobileBasicData.setModelName(mobileBasicData.getModelName().replace(" ",""));
        int res = mobileBasicDataMapper.selectByModelName(mobileBasicData.getModelName());
        if(res>0){
            return AjaxResult.error("该手机基础信息已存在,请勿重复录入");
        }
        mobileBasicData.setCreationDate(DateUtils.getNowDate());
        mobileBasicDataMapper.insertMobileBasicData(mobileBasicData);
        return AjaxResult.success();
    }

    /**
     * 修改【手机基础信息】
     *
     * @param mobileBasicData 【手机基础信息】
     * @return 结果
     */
    @Override
    public int updateMobileBasicData(MobileBasicData mobileBasicData)
    {
        mobileBasicData.setUpdateDate(DateUtils.getNowDate());
        return mobileBasicDataMapper.updateMobileBasicData(mobileBasicData);
    }

    /**
     * 批量删除【手机基础信息】
     *
     * @param modelIds 需要删除的【手机基础信息】主键
     * @return 结果
     */
    @Override
    public AjaxResult deleteMobileBasicDataByModelIds(Long[] modelIds)
    {
        //查询手机数据是否绑定过
        int enduranceIsExist=enduranceMapper.selectByBrandIds(modelIds);
        if(enduranceIsExist>0){
            return AjaxResult.error("该手机基础信息已绑定续航数据，请勿删除");
        }
        int gameIsExist=gameDataMapper.selectByModelIds(modelIds);
        if(gameIsExist>0){
            return AjaxResult.error("该手机基础信息已绑定游戏性能数据，请勿删除");
        }
        mobileBasicDataMapper.deleteMobileBasicDataByModelIds(modelIds);
        return AjaxResult.success();
    }

    /**
     * 删除【手机基础信息】信息
     *
     * @param modelId 【手机基础信息】主键
     * @return 结果
     */
    @Override
    public int deleteMobileBasicDataByModelId(Long modelId)
    {
        return mobileBasicDataMapper.deleteMobileBasicDataByModelId(modelId);
    }
}
