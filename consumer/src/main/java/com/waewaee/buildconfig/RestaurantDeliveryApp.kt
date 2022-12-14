package com.waewaee.buildconfig

import android.app.Application
import com.waewaee.shared.data.models.RestaurantModelImpl

class RestaurantDeliveryApp: Application() {
    override fun onCreate() {
        super.onCreate()
        RestaurantModelImpl.initRetrofitWithBaseUrl(BuildConfig.ENDPOINT)
    }
}