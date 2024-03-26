package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.huaSheng.GameBasicInfo;
import com.ruoyi.system.domain.reponse.GameInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【游戏基础数据】Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-20
 */
@Mapper
public interface GameBasicInfoMapper
{
    /**
     * 查询【游戏基础数据】
     *
     * @param gameId 【游戏基础数据】主键
     * @return 【游戏基础数据】
     */
    public GameBasicInfo selectGameBasicInfoByGameId(Long gameId);

    /**
     * 查询【请填写功能名称】列表
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
    public int insertGameBasicInfo(GameBasicInfo gameBasicInfo);

    /**
     * 修改【游戏基础数据】
     *
     * @param gameBasicInfo 【游戏基础数据】
     * @return 结果
     */
    public int updateGameBasicInfo(GameBasicInfo gameBasicInfo);

    /**
     * 删除【游戏基础数据】
     *
     * @param gameId 【游戏基础数据】主键
     * @return 结果
     */
    public int deleteGameBasicInfoByGameId(Long gameId);

    /**
     * 批量删除【游戏基础数据】
     *
     * @param gameIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGameBasicInfoByGameIds(Long[] gameIds);

    List<GameInfo> selectGameInfo(String gameName);

    int selectByGameName(String gameName);
}

