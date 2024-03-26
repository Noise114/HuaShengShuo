package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.huaSheng.MobileBasicData;
import com.ruoyi.system.domain.reponse.MobileInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【手机基础信息】Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-19
 */
@Mapper
public interface MobileBasicDataMapper
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
     * 删除【请填写功能名称】
     *
     * @param modelId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMobileBasicDataByModelId(Long modelId);

    /**
     * 批量删除【手机基础信息】
     *
     * @param modelIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMobileBasicDataByModelIds(Long[] modelIds);

    /**
     * 查询手机基础信息
     * @param mobile
     * @return
     */
     List<MobileInfo> selectMobileInfoList(String modelName);

    int selectByModelName(String modelName);

}
