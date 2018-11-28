package com.ujujzk.trykoin.presentation.ui

import com.sfera.mirror.ui.base.IPresenter
import com.sfera.mirror.ui.base.IView

interface MainContract {

    interface View : IView{

        fun textRetrieved(text: String)

    }

    interface Presenter<V : View> : IPresenter<V> {
        fun retrieveText()
    }
}