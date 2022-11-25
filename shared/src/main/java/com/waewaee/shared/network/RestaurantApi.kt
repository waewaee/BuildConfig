package com.waewaee.shared.network

import com.waewaee.shared.network.responses.GetRestaurantsResponse
import io.reactivex.rxjava3.core.Observable
import retrofit2.http.GET
import java.util.*

interface RestaurantApi {
    @GET(ENDPOINT_GET_RESTAURANTS)
    fun getRestaurants() : Observable<GetRestaurantsResponse>
}