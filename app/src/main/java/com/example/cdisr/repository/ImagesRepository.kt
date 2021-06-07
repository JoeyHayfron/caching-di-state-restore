package com.example.cdisr.repository

import com.example.cdisr.domain.model.ResponseObject

interface ImagesRepository {
    suspend fun getImages(apiKey: String) : List<ResponseObject>
}