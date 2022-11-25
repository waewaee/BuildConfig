package com.waewaee.shared.data.vos

import com.google.gson.annotations.SerializedName

data class RestaurantVO(
    @SerializedName("name")
    val name: String? = "",

    @SerializedName("category")
    val category: String? = "",

    @SerializedName("delivery_price")
    val deliveryPrice: Int? = 0,

    @SerializedName("rating")
    val rating: Double? = 0.0,

    @SerializedName("image_url")
    val imageUrl: String? = "",
)
