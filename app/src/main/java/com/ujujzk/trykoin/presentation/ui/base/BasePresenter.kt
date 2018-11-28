package com.sfera.mirror.ui.base



abstract class BasePresenter<V : IView> : IPresenter<V> {

    @Volatile
    var view: V? = null

    override fun bindView(view: V) {
        this.view = view
    }

    override fun unbindView() {
        this.view = null
    }

    override fun dispose() {}


    fun isViewAttached() = this.view != null

}