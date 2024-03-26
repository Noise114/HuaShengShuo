package com.ruoyi.web.controller.huasheng;

import com.ruoyi.system.domain.huaSheng.MobileBasicData;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.service.IMobileBasicDataService;
import com.ruoyi.common.core.page.TableDataInfo;

import java.util.List;

/**
 * 【手机基础信息】Controller
 *
 * @author noise
 * @date 2024-03-19
 */
@RestController
@RequestMapping("/huasheng/mobilebasic")
public class MobileBasicDataController extends BaseController
{
    @Autowired
    private IMobileBasicDataService mobileBasicDataService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('huasheng:mobilebasic:list')")
    @GetMapping("/list")
    public TableDataInfo list(MobileBasicData mobileBasicData)
    {
        startPage();
        List<MobileBasicData> list = mobileBasicDataService.selectMobileBasicDataList(mobileBasicData);
        return getDataTable(list);
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('huasheng:mobilebasic:query')")
    @GetMapping(value = "/{modelId}")
    public AjaxResult getInfo(@PathVariable("modelId") Long modelId)
    {
        return success(mobileBasicDataService.selectMobileBasicDataByModelId(modelId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('huasheng:mobilebasic:add')")
    @PostMapping
    public AjaxResult add(@RequestBody MobileBasicData mobileBasicData)
    {
        return mobileBasicDataService.insertMobileBasicData(mobileBasicData);
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('huasheng:mobilebasic:edit')")
    @PutMapping
    public AjaxResult edit(@RequestBody MobileBasicData mobileBasicData)
    {
        return toAjax(mobileBasicDataService.updateMobileBasicData(mobileBasicData));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('huasheng:mobilebasic:remove')")
    @DeleteMapping("/{modelIds}")
    public AjaxResult remove(@PathVariable Long[] modelIds)
    {
        return mobileBasicDataService.deleteMobileBasicDataByModelIds(modelIds);
    }
}

