package com.ruoyi.system.service.impl;

import com.ruoyi.system.domain.huaSheng.GameBasicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.GameBasicInfoMapper;
import com.ruoyi.system.service.IGameBasicInfoService;
import java.util.List;

/**
 * 【游戏基础数据】Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-20
 */
@Service
public class GameBasicInfoServiceImpl implements IGameBasicInfoService
{
    @Autowired
    private GameBasicInfoMapper gameBasicInfoMapper;

    /**
     * 查询【游戏基础数据】
     *
     * @param gameId 【游戏基础数据】主键
     * @return 【游戏基础数据】
     */
    @Override
    public GameBasicInfo selectGameBasicInfoByGameId(Long gameId)
    {
        return gameBasicInfoMapper.selectGameBasicInfoByGameId(gameId);
    }

    /**
     * 查询【游戏基础数据】列表
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 【游戏基础数据】
     */
    @Override
    public List<GameBasicInfo> selectGameBasicInfoList(GameBasicInfo gameBasicInfo)
    {
        return gameBasicInfoMapper.selectGameBasicInfoList(gameBasicInfo);
    }

    /**
     * 新增【游戏基础数据】
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 结果
     */
    @Override
    public int insertGameBasicInfo(GameBasicInfo gameBasicInfo)
    {
        return gameBasicInfoMapper.insertGameBasicInfo(gameBasicInfo);
    }

    /**
     * 修改【游戏基础数据】
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 结果
     */
    @Override
    public int updateGameBasicInfo(GameBasicInfo gameBasicInfo)
    {
        return gameBasicInfoMapper.updateGameBasicInfo(gameBasicInfo);
    }

    /**
     * 批量删除【游戏基础数据】
     *
     * @param gameIds 需要删除的【游戏基础数据】主键
     * @return 结果
     */
    @Override
    public int deleteGameBasicInfoByGameIds(Long[] gameIds)
    {
        return gameBasicInfoMapper.deleteGameBasicInfoByGameIds(gameIds);
    }

    /**
     * 删除【游戏基础数据】信息
     *
     * @param gameId 【游戏基础数据】主键
     * @return 结果
     */
    @Override
    public int deleteGameBasicInfoByGameId(Long gameId)
    {
        return gameBasicInfoMapper.deleteGameBasicInfoByGameId(gameId);
    }
}

