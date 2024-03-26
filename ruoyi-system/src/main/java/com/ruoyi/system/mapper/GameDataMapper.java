package com.ruoyi.system.mapper;


import com.ruoyi.system.domain.huaSheng.GameData;
import com.ruoyi.system.domain.reponse.GameDataReponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 游戏性能Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-21
 */
@Mapper
public interface GameDataMapper
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
    public int insertGameData(GameData gameData);

    /**
     * 修改游戏性能
     *
     * @param gameData 游戏性能
     * @return 结果
     */
    public int updateGameData(GameData gameData);

    /**
     * 删除游戏性能
     *
     * @param id 游戏性能主键
     * @return 结果
     */
    public int deleteGameDataById(Long id);

    /**
     * 批量删除游戏性能
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGameDataByIds(Long[] ids);

    /**
     * 通过手机型号查询该游戏是否已经录入
     *
     * @param modelId
     * @param gameId
     * @return
     */
    int selectGameInfoByMobileName(@Param("modelId") Long modelId, @Param("gameId")Long gameId);

    int selectByModelIds(Long[] ids);
}
