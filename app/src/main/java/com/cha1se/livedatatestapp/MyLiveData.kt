package com.cha1se.livedatatestapp

import androidx.lifecycle.LiveData

class MyLiveData : LiveData<String>() {

    public fun setData(str: String) {
        value = str
    }

    override fun onActive() {
        super.onActive()
    }

    override fun onInactive() {
        super.onInactive()
    }

}