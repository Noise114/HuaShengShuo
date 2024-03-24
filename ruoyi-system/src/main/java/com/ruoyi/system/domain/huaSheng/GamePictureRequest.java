package com.ruoyi.system.domain.huaSheng;

import lombok.Data;

@Data
public class GamePictureRequest {

    /** 帧率图片地址 */
    private String frameRateImageUrl;

    /** 功耗图片地址 */
    private String powerConsumptionImageUrl;

    /** 温度正面图片地址 */
    private String temperatureFrontImageUrl;

    /** 温度侧面图片地址 */
    private String temperatureSideImageUrl;

    /** 温度背面面图片地址 */
    private String temperatureBackImageUrl;
}
