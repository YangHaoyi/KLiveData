package com.yanghaoyi.klivedata.model

import com.yanghaoyi.klivedata.model.bean.WeatherNetData
import com.yanghaoyi.net.client.OnGetDataListener
import rx.Observer
import rx.android.schedulers.AndroidSchedulers
import rx.schedulers.Schedulers

/**
 * @author : YangHaoYi on  2019/6/4.
 * Email  :  yang.haoyi@qq.com
 * Description : 数据Model
 * Change : YangHaoYi on  2019/6/4.
 * Version : V 1.0
 */
class WeatherModel : AbstractBaseModel() {

    /**  天气网络请求 **/
    fun request(listener:OnGetDataListener<WeatherNetData>,city:String){
        val response = api.getWeatherData(city)
        response.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(object :Observer<WeatherNetData>{
                    override fun onError(e: Throwable?) {
                        listener.fail(null,"")
                    }
                    override fun onNext(t: WeatherNetData?) {
                        listener.success(t)
                    }
                    override fun onCompleted() {
                    }
                })
    }
}