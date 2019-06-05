package com.yanghaoyi.klivedata.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.yanghaoyi.klivedata.model.WeatherModel
import com.yanghaoyi.klivedata.model.bean.WeatherNetData
import com.yanghaoyi.net.client.OnGetDataListener

/**
 * @author : YangHaoYi on  2019/6/4
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on  2019/6/4
 * Version : V 1.0
 */
open class WeatherViewModel : ViewModel(){

    var weatherEvent = MutableLiveData<WeatherNetData>()

    /**  获取天气数据 **/
    open fun requestWeather(city:String){
        WeatherModel().request(object :OnGetDataListener<WeatherNetData>{
            override fun fail(response: WeatherNetData?, msg: String?) {
                //主线程
                weatherEvent.value = response
            }
            override fun success(response: WeatherNetData?) {
                weatherEvent.value = response
            }
        },city)
    }
}