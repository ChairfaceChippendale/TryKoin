package com.ujujzk.trykoin

import android.app.Application
import com.ujujzk.trykoin.presentation.di.module.appModule
import org.koin.android.ext.android.startKoin

class TryKoinApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(appModule))
    }
}