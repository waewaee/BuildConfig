package com.waewaee.shared.network.responses

import com.google.gson.annotations.SerializedName
import com.waewaee.shared.data.vos.RestaurantVO

data class GetRestaurantsResponse(
    @SerializedName("code")
    val code: Int? = 0,

    @SerializedName("message")
    val message: String? = "",

    @SerializedName("data")
    val data: List<RestaurantVO>? = listOf(),
)
