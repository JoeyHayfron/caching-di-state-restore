package com.example.cdisr.network.model

import com.google.gson.annotations.SerializedName

data class ResponseObjectDTO(
    @SerializedName("id")
    val id: String?,
    @SerializedName("urls")
    val urlsDTO: UrlsDTO?,
)