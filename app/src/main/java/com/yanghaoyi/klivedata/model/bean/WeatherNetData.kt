package com.yanghaoyi.klivedata.model.bean

/**
 * @author : YangHaoYi on  2019/6/4
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on  2019/6/4
 * Version : V 1.0
 */
class WeatherNetData {

    /**
     * code : 200
     * msg : 成功!
     * data : {"yesterday":{"date":"3日星期一","high":"高温 32℃","fx":"无持续风向","low":"低温 21℃","fl":"<![CDATA[<3级]]>","type":"晴"},"city":"成都","aqi":null,"forecast":[{"date":"4日星期二","high":"高温 31℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"无持续风向","type":"多云"},{"date":"5日星期三","high":"高温 31℃","fengli":"<![CDATA[<3级]]>","low":"低温 21℃","fengxiang":"无持续风向","type":"晴"},{"date":"6日星期四","high":"高温 32℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"多云"},{"date":"7日星期五","high":"高温 29℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"多云"},{"date":"8日星期六","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"阵雨"}],"ganmao":"各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。","wendu":"32"}
     */

    var code: Int = 0
    var msg: String? = null
    var data: DataBean? = null

    class DataBean {
        /**
         * yesterday : {"date":"3日星期一","high":"高温 32℃","fx":"无持续风向","low":"低温 21℃","fl":"<![CDATA[<3级]]>","type":"晴"}
         * city : 成都
         * aqi : null
         * forecast : [{"date":"4日星期二","high":"高温 31℃","fengli":"<![CDATA[<3级]]>","low":"低温 20℃","fengxiang":"无持续风向","type":"多云"},{"date":"5日星期三","high":"高温 31℃","fengli":"<![CDATA[<3级]]>","low":"低温 21℃","fengxiang":"无持续风向","type":"晴"},{"date":"6日星期四","high":"高温 32℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"多云"},{"date":"7日星期五","high":"高温 29℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"多云"},{"date":"8日星期六","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"阵雨"}]
         * ganmao : 各项气象条件适宜，发生感冒机率较低。但请避免长期处于空调房间中，以防感冒。
         * wendu : 32
         */
        var yesterday: YesterdayBean? = null
        var city: String? = null
        var aqi: Any? = null
        var ganmao: String? = null
        var wendu: String? = null
        var forecast: List<ForecastBean>? = null

        class YesterdayBean {
            /**
             * date : 3日星期一
             * high : 高温 32℃
             * fx : 无持续风向
             * low : 低温 21℃
             * fl : <![CDATA[<3级]]>
             * type : 晴
             */

            var date: String? = null
            var high: String? = null
            var fx: String? = null
            var low: String? = null
            var fl: String? = null
            var type: String? = null
        }

        class ForecastBean {
            /**
             * date : 4日星期二
             * high : 高温 31℃
             * fengli : <![CDATA[<3级]]>
             * low : 低温 20℃
             * fengxiang : 无持续风向
             * type : 多云
             */

            var date: String? = null
            var high: String? = null
            var fengli: String? = null
            var low: String? = null
            var fengxiang: String? = null
            var type: String? = null
        }
    }
}
