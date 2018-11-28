package com.sfera.mirror.ui.base


interface IPresenter<V : IView> {

    fun bindView(view: V)

    fun unbindView()

    fun dispose()
}