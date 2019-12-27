package com.wg.controller;

import com.wg.service.RewardService;
import com.wg.utils.DataMap;
import com.wg.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: insane
 * @Date: 2019/7/14 15:42
 * Describe:
 */
@Controller
@ResponseBody
public class RewardControl {

    @Autowired
    private RewardService rewardService;

    @PostMapping(value = "/getRewardInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getRewardInfo(){
        DataMap data = rewardService.getRewardInfo();
        return JsonResult.build(data).toJSON();
    }

}
