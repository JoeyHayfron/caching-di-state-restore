package com.example.cdisr.repository

import com.example.cdisr.domain.model.ResponseObject
import com.example.cdisr.network.ImageService
import com.example.cdisr.network.model.ResponseObjectDTOMapper
import javax.inject.Inject

class ImagesRepositoryImpl
    @Inject constructor(
        private val responseObjectMapper: ResponseObjectDTOMapper,
        private val imageService: ImageService
    ): ImagesRepository {
    override suspend fun getImages(apiKey: String): List<ResponseObject> {
        println("LOG-D ${responseObjectMapper.mapToDomainList(imageService.getPhotos(apiKey))}")
        return responseObjectMapper.mapToDomainList(imageService.getPhotos(apiKey))
    }
}