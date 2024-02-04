package com.example.kyrsovaya

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kyrsovaya.adapters.WeatherModel

class MainViewModel : ViewModel() {
    val liveDataCurrent = MutableLiveData<WeatherModel>()
    val liveDataList = MutableLiveData<List<WeatherModel>>()
}