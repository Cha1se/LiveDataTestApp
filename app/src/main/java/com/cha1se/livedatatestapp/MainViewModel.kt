package com.cha1se.livedatatestapp

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var myLiveData = MutableLiveData<String>()

    init {
        startTimer()
    }

    fun startTimer() {

        object: CountDownTimer(10000, 1000) {

            override fun onTick(millisUntilFinished: Long) {

                myLiveData.value = (millisUntilFinished / 1000).toString()

            }

            override fun onFinish() {

                myLiveData.value = "End"

            }
        }.start()

    }



}