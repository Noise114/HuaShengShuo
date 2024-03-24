package com.ruoyi.web.controller.huasheng;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.system.domain.Statistics;
import com.ruoyi.system.service.IEnduranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(enduranceService.selectStatisticsById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:add')")
    @PostMapping
    public AjaxResult add(@RequestBody Statistics statistics)
    {
        return toAjax(enduranceService.insertStatistics(statistics));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:edit')")
    @PutMapping
    public AjaxResult edit(@RequestBody Statistics statistics)
    {
        return toAjax(enduranceService.updateStatistics(statistics));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('system:statistics:remove')")
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(enduranceService.deleteStatisticsByIds(ids));
    }



}
