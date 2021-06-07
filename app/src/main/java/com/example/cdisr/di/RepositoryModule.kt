package com.example.cdisr.di

import com.example.cdisr.network.ImageService
import com.example.cdisr.network.model.ResponseObjectDTOMapper
import com.example.cdisr.repository.ImagesRepository
import com.example.cdisr.repository.ImagesRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideImageRepository(
        responseObjectDTOMapper: ResponseObjectDTOMapper,
        imageService: ImageService
    ): ImagesRepository{
        return ImagesRepositoryImpl(responseObjectDTOMapper, imageService)
    }
}