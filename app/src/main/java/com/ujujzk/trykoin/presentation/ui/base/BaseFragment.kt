package com.ujujzk.trykoin.presentation.ui.base

import android.content.Context
import android.support.v4.app.Fragment
import android.widget.Toast
import com.sfera.mirror.ui.base.BaseActivity
import com.sfera.mirror.ui.base.IView


abstract class BaseFragment : Fragment(), IView {


    var activity: BaseActivity? = null

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity){
            this.activity = context

            context.onFragmentAttached()
        }
    }

    override fun onDetach() {
        activity = null
        super.onDetach()
    }

    override fun showProgress(show: Boolean) {
        if (isAdded) activity?.showProgress(show)
    }

    override fun isNetworkConnected(): Boolean = activity?.isNetworkConnected() ?: false

    override fun toast(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }

    interface Callback {

        fun onFragmentAttached()

        fun onFragmentDetached(tag: String)
    }
}