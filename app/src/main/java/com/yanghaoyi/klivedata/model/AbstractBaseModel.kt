package com.yanghaoyi.klivedata.model

import com.yanghaoyi.klivedata.model.api.AdvanceAPI
import com.yanghaoyi.net.client.ApiClient

/**
 * @author : YangHaoYi on  2019/5/21
 * Email  :  yang.haoyi@qq.com
 * Description : 数据Model基类
 * Change : YangHaoYi on  2019/5/21
 * Version : V 1.0
 */
open class AbstractBaseModel {
    //请求接口
    protected var api: AdvanceAPI
    private val BASE_URL = "https://www.apiopen.top/"

    init {
        api = ApiClient.getInstance().setBaseUrl(BASE_URL)
                .init<AdvanceAPI>(AdvanceAPI::class.java)
    }

}
