package com.ujujzk.trykoin.presentation.di.module

import com.ujujzk.trykoin.data.SimpleGate
import com.ujujzk.trykoin.data.SimpleGateImpl
import com.ujujzk.trykoin.data.SimpleService
import com.ujujzk.trykoin.data.SimpleServiceImpl
import com.ujujzk.trykoin.presentation.ui.MainContract
import com.ujujzk.trykoin.presentation.ui.MainPresenter
import org.koin.dsl.module.module

val appModule = module {

    single<SimpleGate> { SimpleGateImpl(get()) }

    single<SimpleService> { SimpleServiceImpl()}



    factory { MainPresenter<MainContract.View>(get()) as MainContract.Presenter<MainContract.View>}


}