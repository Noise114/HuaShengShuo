package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.Statistics;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 续航统计数据
 * 
 * @author ruoyi
 */
@Mapper
public interface EnduranceMapper
{

    /**
     * 查询【续航统计数据】
     *
     * @param id 【续航统计数据】主键
     * @return 【续航统计数据】
     */
     Statistics selectStatisticsById(Long id);

    /**
     * 查询岗位数据集合
     * 
     * @param post 岗位信息
     * @return 岗位数据集合
     */
    public List<Statistics> selectEnduranceList(Statistics request);

    /**
     * 新增【续航数据】
     *
     * @param statistics 【续航数据】
     * @return 结果
     */
    public int insertStatistics(Statistics statistics);
    /**
     * 修改【续航数据】
     *
     * @param statistics 【续航数据】
     * @return 结果
     */
    public int updateStatistics(Statistics statistics);

    /**
     * 删除【续航数据】
     *
     * @param id 【续航数据】主键
     * @return 结果
     */
    public int deleteStatisticsById(Long id);

    /**
     * 批量删除【续航数据】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStatisticsByIds(Long[] ids);

}
