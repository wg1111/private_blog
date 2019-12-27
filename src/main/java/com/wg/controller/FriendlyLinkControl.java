package com.wg.controller;

import com.wg.service.FriendLinkService;
import com.wg.utils.DataMap;
import com.wg.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: insane
 * @Date: 2019/5/19 17:04
 * Describe: 友链页面
 */
@RestController
public class FriendlyLinkControl {

    @Autowired
    FriendLinkService friendLinkService;

    /**
     * 获得所有友链信息
     */
    @PostMapping(value = "/getFriendLinkInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getFriendLink(){
        DataMap data = friendLinkService.getFriendLink();
        return JsonResult.build(data).toJSON();
    }

}
