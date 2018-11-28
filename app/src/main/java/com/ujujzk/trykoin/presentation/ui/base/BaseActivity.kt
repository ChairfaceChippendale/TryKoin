package com.sfera.mirror.ui.base

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast
import com.ujujzk.trykoin.presentation.ui.base.BaseFragment


abstract class BaseActivity : AppCompatActivity(), IView, BaseFragment.Callback {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onDestroy() {
        super.onDestroy()

    }


    override fun isNetworkConnected(): Boolean {
        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE)
        return if (connectivityManager is ConnectivityManager) {
            connectivityManager.activeNetworkInfo?.isConnected ?: false
        } else false
    }

    override fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    override fun onFragmentAttached() {

    }

    override fun onFragmentDetached(tag: String) {

    }




}