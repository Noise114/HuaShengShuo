package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.huaSheng.MobileBasicData;

/**
 * 【手机基础信息】Service接口
 *
 * @author noise
 * @date 2024-03-19
 */
public interface IMobileBasicDataService
{
    /**
     * 查询【手机基础信息】
     *
     * @param modelId 【手机基础信息】主键
     * @return 【手机基础信息】
     */
    public MobileBasicData selectMobileBasicDataByModelId(Long modelId);

    /**
     * 查询【手机基础信息】列表
     *
     * @param mobileBasicData 【手机基础信息】
     * @return 【手机基础信息】集合
     */
    public List<MobileBasicData> selectMobileBasicDataList(MobileBasicData mobileBasicData);

    /**
     * 新增【手机基础信息】
     *
     * @param mobileBasicData 【手机基础信息】
     * @return 结果
     */
    public int insertMobileBasicData(MobileBasicData mobileBasicData);

    /**
     * 修改【手机基础信息】
     *
     * @param mobileBasicData 【手机基础信息】
     * @return 结果
     */
    public int updateMobileBasicData(MobileBasicData mobileBasicData);

    /**
     * 批量删除【手机基础信息】
     *
     * @param modelIds 需要删除的【手机基础信息】主键集合
     * @return 结果
     */
    public int deleteMobileBasicDataByModelIds(Long[] modelIds);

    /**
     * 删除【手机基础信息】信息
     *
     * @param modelId 【手机基础信息】主键
     * @return 结果
     */
    public int deleteMobileBasicDataByModelId(Long modelId);
}
