package com.ruoyi.system.service.impl;

import com.ruoyi.common.constant.UserConstants;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.exception.ServiceException;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.domain.SysPost;
import com.ruoyi.system.mapper.EnduranceMapper;
import com.ruoyi.system.mapper.SysPostMapper;
import com.ruoyi.system.mapper.SysUserPostMapper;
import com.ruoyi.system.service.IEnduranceService;
import com.ruoyi.system.service.ISysPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 耗电数据 服务层处理
 * 
 * @author ruoyi
 */
@Service
public class EnduranceServiceImpl implements IEnduranceService
{
    @Autowired
    EnduranceMapper enduranceMapper;


    @Override
    public Statistics selectStatisticsById(Long id) {
        return enduranceMapper.selectStatisticsById(id);
    }

    /**
     * 查询耗电数据集合
     * 
     * @param request 请求参数
     * @return 耗电数据集合
     */
    @Override
    public List<Statistics> selectEnduranceList(Statistics request)
    {
        return enduranceMapper.selectEnduranceList(request);
    }

    @Override
    public AjaxResult insertStatistics(Statistics statistics) {
        int res = enduranceMapper.selectByBrandId(statistics.getSelectedModel());
        if(res>0){
            return AjaxResult.error("该手机续航数据已存在,请勿重复录入");
        }
        statistics.setCreateTime(DateUtils.getNowDate());
        enduranceMapper.insertStatistics(statistics);
        return AjaxResult.success();
    }

    @Override
    public int updateStatistics(Statistics statistics) {
        statistics.setUpdateTime(DateUtils.getNowDate());
        return enduranceMapper.updateStatistics(statistics);
    }

    @Override
    public int deleteStatisticsByIds(Long[] ids) {
        return  enduranceMapper.deleteStatisticsByIds(ids);
    }

    @Override
    public int deleteStatisticsById(Long id) {
        return enduranceMapper.deleteStatisticsById(id);
    }


}
