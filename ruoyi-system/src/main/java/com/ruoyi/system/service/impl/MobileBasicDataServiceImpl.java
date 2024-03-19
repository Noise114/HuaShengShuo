package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.system.domain.huaSheng.MobileBasicData;
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
    public int insertMobileBasicData(MobileBasicData mobileBasicData)
    {
        mobileBasicData.setCreationDate(DateUtils.getNowDate());
        return mobileBasicDataMapper.insertMobileBasicData(mobileBasicData);
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
        return mobileBasicDataMapper.updateMobileBasicData(mobileBasicData);
    }

    /**
     * 批量删除【手机基础信息】
     *
     * @param modelIds 需要删除的【手机基础信息】主键
     * @return 结果
     */
    @Override
    public int deleteMobileBasicDataByModelIds(Long[] modelIds)
    {
        return mobileBasicDataMapper.deleteMobileBasicDataByModelIds(modelIds);
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
