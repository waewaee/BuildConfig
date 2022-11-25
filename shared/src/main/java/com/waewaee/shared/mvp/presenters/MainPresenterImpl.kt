package com.waewaee.shared.mvp.presenters

import androidx.lifecycle.ViewModel
import com.waewaee.shared.data.models.RestaurantModel
import com.waewaee.shared.data.models.RestaurantModelImpl
import com.waewaee.shared.mvp.views.MainView

class MainPresenterImpl: MainPresenter, ViewModel() {

    var mView: MainView? = null

    // Model
    private val mRestaurantModel: RestaurantModel = RestaurantModelImpl

    override fun initPresenter(view: MainView) {
        mView = view
    }

    override fun onUiReady() {
        mRestaurantModel.getRestaurants(
            onSuccess = { mView?.showRestaurants(it) },
            onFailure = { mView?.showError(it) }
        )
    }
}