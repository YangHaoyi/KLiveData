package com.yanghaoyi.klivedata.view

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.view.View
import com.yanghaoyi.klivedata.R
import com.yanghaoyi.klivedata.databinding.ActivityMainBinding
import com.yanghaoyi.klivedata.model.bean.WeatherNetData
import com.yanghaoyi.klivedata.viewmodel.WeatherViewModel

/**
 * @author : YangHaoYi on  2019/6/4
 * Email  :  yang.haoyi@qq.com
 * Description : MVVM LiveData DataBinding kotlin 示例
 * Change : YangHaoYi on  2019/6/4
 * Version : V 1.0
 */
class MainActivity : FragmentActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var viewModel:WeatherViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //初始化DataBinding
        binding =DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.presenter = WeatherPresenter()
        init()
    }

    /**  添加viewModel绑定 **/
    private fun init(){
        viewModel = ViewModelProvider(
                this, ViewModelProvider.AndroidViewModelFactory(application)
        ).get(WeatherViewModel::class.java)
        //添加数据观察
        viewModel.weatherEvent.observe(this, Observer<WeatherNetData> { data -> binding.weatherData = data })
    }

    /**  点击事件逻辑中心 **/
    open inner class WeatherPresenter{
        open  fun onClick(view:View,city:String){
            when (view.id) {
                R.id.tvSearch -> {
                    this@MainActivity.viewModel.requestWeather(city)
                }
                else -> {
                    //default
                }
            }
        }
    }

}
