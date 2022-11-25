package com.waewaee.shared.mvp.presenters

import com.waewaee.shared.mvp.views.MainView

interface MainPresenter {
    fun initPresenter(view: MainView)
    fun onUiReady()
}