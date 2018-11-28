package com.ujujzk.trykoin.presentation.ui

import android.os.Bundle
import android.util.Log
import com.sfera.mirror.ui.base.BaseActivity
import com.ujujzk.trykoin.R
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity(), MainContract.View {

    val presenter: MainContract.Presenter<MainContract.View> by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.bindView(this)

        presenter.retrieveText()

    }


    override fun textRetrieved(text: String) {
        Log.w("TAG", text)
    }
}
