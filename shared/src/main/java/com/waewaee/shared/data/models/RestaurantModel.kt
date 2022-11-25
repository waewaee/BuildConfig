package com.waewaee.shared.data.models

import com.waewaee.shared.data.vos.RestaurantVO

interface RestaurantModel {
    fun getRestaurants(
        onSuccess: (List<RestaurantVO>) -> Unit,
        onFailure: (String) -> Unit,
    )
}