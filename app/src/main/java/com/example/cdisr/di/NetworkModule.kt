package com.example.cdisr.di

import com.example.cdisr.network.ImageService
import com.example.cdisr.network.model.ResponseObjectDTOMapper
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    @Named("api_key")
    fun provideAPIKEY() : String{
        return "Client-ID w8r4BImcDDaYYY-tQncDFeL5SAr-yTblPA19ku92FVc"
    }

    @Singleton
    @Provides
    fun provideResponseObjectMapper(): ResponseObjectDTOMapper {
        return ResponseObjectDTOMapper()
    }

    @Singleton
    @Provides
    fun provideImageService(): ImageService{
        return Retrofit.Builder()
            .baseUrl("https://api.unsplash.com/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(ImageService::class.java)
    }
}