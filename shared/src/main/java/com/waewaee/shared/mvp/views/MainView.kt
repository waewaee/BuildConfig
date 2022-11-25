package com.waewaee.shared.mvp.views

import com.waewaee.shared.data.vos.RestaurantVO

interface MainView {
    fun showRestaurants(restaurants: List<RestaurantVO>)
    fun showError(errorMessage: String)
}