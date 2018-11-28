package com.ujujzk.trykoin.presentation.ui

import com.sfera.mirror.ui.base.BasePresenter
import com.ujujzk.trykoin.data.SimpleGate

class MainPresenter<V : MainContract.View> (val gate: SimpleGate): BasePresenter<V>(), MainContract.Presenter<V> {

    override fun retrieveText() {
        view?.textRetrieved(gate.getText())
    }
}