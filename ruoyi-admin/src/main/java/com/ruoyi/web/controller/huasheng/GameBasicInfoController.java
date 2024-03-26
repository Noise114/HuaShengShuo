package com.ruoyi.web.controller.huasheng;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import com.ruoyi.system.domain.huaSheng.GameBasicInfo;
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
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.service.IGameBasicInfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【游戏基础数据】Controller
 * @author ruoyi
 * @date 2024-03-20
 */
@RestController
@RequestMapping("/huasheng/gameinfo")
public class GameBasicInfoController extends BaseController
{
    @Autowired
    private IGameBasicInfoService gameBasicInfoService;

    /**
     * 查询【游戏基础数据】列表
     */
    @PreAuthorize("@ss.hasPermi('huasheng:gameinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(GameBasicInfo gameBasicInfo)
    {
        startPage();
        List<GameBasicInfo> list = gameBasicInfoService.selectGameBasicInfoList(gameBasicInfo);
        return getDataTable(list);
    }


    /**
     * 获取【游戏基础数据】详细信息
     */
    @PreAuthorize("@ss.hasPermi('huasheng:gameinfo:query')")
    @GetMapping(value = "/{gameId}")
    public AjaxResult getInfo(@PathVariable("gameId") Long gameId)
    {
        return success(gameBasicInfoService.selectGameBasicInfoByGameId(gameId));
    }

    /**
     * 新增【游戏基础数据】
     */
    @PreAuthorize("@ss.hasPermi('huasheng:gameinfo:add')")
    @Log(title = "【游戏基础数据】", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GameBasicInfo gameBasicInfo)
    {
        return gameBasicInfoService.insertGameBasicInfo(gameBasicInfo);
    }

    /**
     * 修改【游戏基础数据】
     */
    @PreAuthorize("@ss.hasPermi('huasheng:gameinfo:edit')")
    @Log(title = "【游戏基础数据】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GameBasicInfo gameBasicInfo)
    {
        return toAjax(gameBasicInfoService.updateGameBasicInfo(gameBasicInfo));
    }

    /**
     * 删除【游戏基础数据】
     */
    @PreAuthorize("@ss.hasPermi('huasheng:gameinfo:remove')")
    @Log(title = "【游戏基础数据】", businessType = BusinessType.DELETE)
    @DeleteMapping("/{gameIds}")
    public AjaxResult remove(@PathVariable Long[] gameIds)
    {
        return toAjax(gameBasicInfoService.deleteGameBasicInfoByGameIds(gameIds));
    }
}
