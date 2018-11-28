package com.sfera.mirror.ui.base


interface IView {

    fun isNetworkConnected() : Boolean

    fun toast(message: String)

    fun showProgress(show: Boolean){
        throw RuntimeException("Not implemented")
    }
}