package com.wg.service;

import com.wg.model.DailySpeech;
import com.wg.utils.DataMap;

/**
 * @author: insane
 * @Date: 2018/11/28 15:33
 * Describe: 藏心阁-今日
 */
public interface TodayService {

    DataMap publishISay(DailySpeech dailySpeech);

    DataMap getTodayInfo(int rows, int pageNum);

}
