package com.ruoyi.system.service;

import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.domain.SysPost;

import java.util.List;

/**
 * 耗电数据 服务层
 * 
 * @author ruoyi
 */
public interface IEnduranceService
{
    /**
     * 查询续航数据
     * 
     * @param post 岗位信息
     * @return 岗位列表
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
     * 批量删除【续航数据】
     *
     * @param ids 需要删除的【续航数据】主键集合
     * @return 结果
     */
    public int deleteStatisticsByIds(Long[] ids);

    /**
     * 删除【续航数据】信息
     *
     * @param id 【续航数据】主键
     * @return 结果
     */
    public int deleteStatisticsById(Long id);
}
