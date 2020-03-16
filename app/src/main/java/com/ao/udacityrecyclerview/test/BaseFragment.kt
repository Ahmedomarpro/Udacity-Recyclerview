package com.ao.udacityrecyclerview.test

import android.app.Application
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class  BaseFragment: Fragment(){

    abstract var layoutId: Int

    abstract fun setupInjection(applicationComponent: Application)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     }

    protected fun inflateView(inflater: LayoutInflater, container: ViewGroup?): View {
        val view = inflater.inflate(layoutId, container, false)

        return view
    }


}