package com.ruoyi.system.service;


import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.domain.huaSheng.GameBasicInfo;

/**
 * 【游戏基础数据】Service接口
 *
 * @author ruoyi
 * @date 2024-03-20
 */
public interface IGameBasicInfoService
{
    /**
     * 查询【游戏基础数据】
     *
     * @param gameId 【游戏基础数据】主键
     * @return 【游戏基础数据】
     */
    public GameBasicInfo selectGameBasicInfoByGameId(Long gameId);

    /**
     * 查询【游戏基础数据】列表
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 【游戏基础数据】集合
     */
    public List<GameBasicInfo> selectGameBasicInfoList(GameBasicInfo gameBasicInfo);

    /**
     * 新增【游戏基础数据】
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 结果
     */
    public AjaxResult insertGameBasicInfo(GameBasicInfo gameBasicInfo);

    /**
     * 修改【游戏基础数据】
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 结果
     */
    public int updateGameBasicInfo(GameBasicInfo gameBasicInfo);

    /**
     * 批量删除【游戏基础数据】
     *
     * @param gameIds 需要删除的【游戏基础数据】主键集合
     * @return 结果
     */
    public int deleteGameBasicInfoByGameIds(Long[] gameIds);

    /**
     * 删除【游戏基础数据】信息
     *
     * @param gameId 【游戏基础数据】主键
     * @return 结果
     */
    public int deleteGameBasicInfoByGameId(Long gameId);
}
