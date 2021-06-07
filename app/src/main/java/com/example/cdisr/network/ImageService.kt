package com.example.cdisr.network

import com.example.cdisr.network.model.ResponseObjectDTO
import retrofit2.http.GET
import retrofit2.http.Header

interface ImageService {

    @GET("photos")
    suspend fun getPhotos(@Header("Authorization") apiKey: String): List<ResponseObjectDTO>
}