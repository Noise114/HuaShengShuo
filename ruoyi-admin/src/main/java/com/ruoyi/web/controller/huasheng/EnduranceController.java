package com.ruoyi.web.controller.huasheng;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.service.IEnduranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Noise
 * @Description 充电数据接口
 * @Date 2024/03/15 15:59
 */
@RestController
@RequestMapping("/huasheng/endurance")
public class EnduranceController extends BaseController {

    @Autowired
    private IEnduranceService enduranceService;
    /**
     * 获取充电数据列表
     */
    @PreAuthorize("@ss.hasPermi('huasheng:endurance:list')")
    @GetMapping("/list")
    public TableDataInfo list(Statistics request)
    {
        startPage();
        List<Statistics> list = enduranceService.selectEnduranceList(request);
        return getDataTable(list);
    }




}
