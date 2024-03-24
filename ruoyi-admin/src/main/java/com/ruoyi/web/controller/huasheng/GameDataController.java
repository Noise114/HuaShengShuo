package com.ruoyi.web.controller.huasheng;


import java.io.IOException;
import java.util.List;

import com.ruoyi.common.core.text.Convert;
import com.ruoyi.system.domain.huaSheng.GameData;
import com.ruoyi.system.domain.huaSheng.GamePictureRequest;
import com.ruoyi.system.service.IGameDataService;
import org.apache.commons.io.IOUtils;
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
import com.ruoyi.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 游戏性能Controller
 *
 * @author ruoyi
 * @date 2024-03-21
 */
@RestController
@RequestMapping("/huasheng/game")
public class GameDataController extends BaseController
{
    @Autowired
    private IGameDataService gameDataService;

    /**
     * 查询游戏性能列表
     */
    @PreAuthorize("@ss.hasPermi('huasheng:game:list')")
    @GetMapping("/list")
    public TableDataInfo list(GameData gameData)
    {
        startPage();
        List<GameData> list = gameDataService.selectGameDataList(gameData);
        return getDataTable(list);
    }


    /**
     * 获取游戏性能详细信息
     */
    @PreAuthorize("@ss.hasPermi('huasheng:game:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(gameDataService.selectGameDataById(id));
    }

    /**
     * 新增游戏性能
     */
    @PreAuthorize("@ss.hasPermi('huasheng:game:add')")
    @Log(title = "游戏性能", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody GameData gameData)
    {
        return gameDataService.insertGameData(gameData);
    }

    /**
     * 修改游戏性能
     */
    @PreAuthorize("@ss.hasPermi('huasheng:game:edit')")
    @Log(title = "游戏性能", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody GameData gameData)
    {
        return toAjax(gameDataService.updateGameData(gameData));
    }

    /**
     * 删除游戏性能
     */
    @PreAuthorize("@ss.hasPermi('huasheng:game:remove')")
    @Log(title = "游戏性能", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(gameDataService.deleteGameDataByIds(ids));
    }


    @PreAuthorize("@ss.hasPermi('huasheng:game:query')")
    @PostMapping ("/downLoadPicture")
    public void downLoadPicture(HttpServletResponse response, @RequestBody GamePictureRequest request) throws IOException
    {
        byte[] bytes = gameDataService.downLoadPicture(response, request);
        genCode(response,bytes);
    }


    private void genCode(HttpServletResponse response, byte[] data) throws IOException
    {
        response.reset();
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Expose-Headers", "Content-Disposition");
        response.setHeader("Content-Disposition", "attachment; filename=\"picture.zip\"");
        response.addHeader("Content-Length", "" + data.length);
        response.setContentType("application/zip");
        IOUtils.write(data, response.getOutputStream());
    }

}
