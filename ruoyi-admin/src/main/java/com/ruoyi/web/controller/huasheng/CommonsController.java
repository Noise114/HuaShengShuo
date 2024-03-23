package com.ruoyi.web.controller.huasheng;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.system.mapper.GameBasicInfoMapper;
import com.ruoyi.system.mapper.MobileBasicDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/huasheng/comm")
public class CommonsController {

    @Autowired
    MobileBasicDataMapper mobileBasicDataMapper;

    @Autowired
    GameBasicInfoMapper gameBasicInfoMapper;

    @GetMapping(value = "/mobileInfo")
    public AjaxResult getMobileInfo(@RequestParam (value = "name", required = false) String name){

      return  AjaxResult.success(mobileBasicDataMapper.selectMobileInfoList(name));
    }

    @GetMapping(value = "/gameInfo")
    public AjaxResult getGameInfo(@RequestParam (value = "name", required = false) String name)
    {
        return  AjaxResult.success(gameBasicInfoMapper.selectGameInfo(name));
    }
}
