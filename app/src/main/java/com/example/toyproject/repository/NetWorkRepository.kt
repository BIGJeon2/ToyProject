package com.example.toyproject.repository

import com.example.toyproject.network.Api
import com.example.toyproject.network.RetrofitInstance

class NetWorkRepository {

    private val client = RetrofitInstance.getInstance().create(Api::class.java)

    suspend fun getCurrentCoinList() = client.getCurrentCoinList()

}