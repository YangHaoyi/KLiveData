package com.yanghaoyi.klivedata.model.api

import com.yanghaoyi.klivedata.model.bean.WeatherNetData
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * @author : YangHaoYi on  2019/6/4
 * Email  :  yang.haoyi@qq.com
 * Description : RestFul API 请求
 * Change : YangHaoYi on  2019/6/4
 * Version : V 1.0
 */
interface AdvanceAPI{
    @GET("weatherApi")
    fun getWeatherData(@Query("city") city: String): Observable<WeatherNetData>
}