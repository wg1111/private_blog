package com.wg.controller;

import com.wg.service.ArticleService;
import com.wg.service.TagService;
import com.wg.utils.DataMap;
import com.wg.utils.JsonResult;
import com.wg.utils.StringUtil;
import com.wg.utils.TransCodingUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: insane
 * @Date: 2018/7/16 21:27
 * Describe:
 */
@RestController
public class TagsControl {

    @Autowired
    TagService tagService;
    @Autowired
    ArticleService articleService;

    /**
     * 分页获得该标签下的文章
     * @param tag
     * @return
     */
    @PostMapping(value = "/getTagArticle", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getTagArticle(@RequestParam("tag") String tag,
                                    HttpServletRequest request){
        if(tag.equals(StringUtil.BLANK)){
            return JsonResult.build(tagService.findTagsCloud()).toJSON();
        }

        tag = TransCodingUtil.unicodeToString(tag);
        int rows = Integer.parseInt(request.getParameter("rows"));
        int pageNum = Integer.parseInt(request.getParameter("pageNum"));
        DataMap data = articleService.findArticleByTag(tag, rows, pageNum);
        return JsonResult.build(data).toJSON();
    }

}
