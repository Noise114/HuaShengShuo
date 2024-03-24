package com.ruoyi.system.domain;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Statistics  {
    /**
     * 主键ID
     */
    private int id;

    /**
     * 机型ID
     */
    private int brandId;
    private int selectedModel;
    /**
     * 机型名称
     */
    private String brandName;

    private String chipName;
    /**
     * 王者荣耀数值
     */
    private BigDecimal aov;

    /**
     * 原神数值
     */
    private BigDecimal gi;

    /**
     * 拍照数值
     */
    private BigDecimal camera;

    /**
     * 哔哩哔哩数值
     */
    private BigDecimal bilibili;

    /**
     * 待机数值
     */
    private BigDecimal standby;

    /**
     * 微博数值
     */
    private BigDecimal weibo;

    /**
     * 吃鸡数值
     */
    private BigDecimal chicken;

    /**
     * 剩余电量数值
     */
    private BigDecimal residue;

    /**
     * 手机类型：1-直板机 2-折叠屏 3-平板电脑
     */
    private int phoneType;

    /**
     * 创建日期
     */
    private Date createTime;

    /**
     * 更新日期
     */
    private Date updateTime;

    /**
     * 创建人
     */
    private String createBy;

    /**
     * 更新人
     */
    private String updateBy;
}
