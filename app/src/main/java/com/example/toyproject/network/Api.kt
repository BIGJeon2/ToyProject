package com.example.toyproject.network

import com.example.toyproject.network.model.CurrentPriceList
import retrofit2.http.GET

interface Api {

    @GET("public/ticker/ALL_KRW")
    suspend fun getCurrentCoinList() : CurrentPriceList


}