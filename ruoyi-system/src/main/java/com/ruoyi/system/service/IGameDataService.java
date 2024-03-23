package com.ruoyi.system.service;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.huaSheng.GameData;

import java.util.List;


/**
 * 游戏性能Service接口
 *
 * @author ruoyi
 * @date 2024-03-21
 */
public interface IGameDataService
{
    /**
     * 查询游戏性能
     *
     * @param id 游戏性能主键
     * @return 游戏性能
     */
    public GameData selectGameDataById(Long id);

    /**
     * 查询游戏性能列表
     *
     * @param gameData 游戏性能
     * @return 游戏性能集合
     */
    public List<GameData> selectGameDataList(GameData gameData);

    /**
     * 新增游戏性能
     *
     * @param gameData 游戏性能
     * @return 结果
     */
    public AjaxResult insertGameData(GameData gameData);

    /**
     * 修改游戏性能
     *
     * @param gameData 游戏性能
     * @return 结果
     */
    public int updateGameData(GameData gameData);

    /**
     * 批量删除游戏性能
     *
     * @param ids 需要删除的游戏性能主键集合
     * @return 结果
     */
    public int deleteGameDataByIds(Long[] ids);

    /**
     * 删除游戏性能信息
     *
     * @param id 游戏性能主键
     * @return 结果
     */
    public int deleteGameDataById(Long id);
}

