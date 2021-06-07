package com.example.cdisr.presentation.ui.imagelist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cdisr.domain.model.ResponseObject
import com.example.cdisr.repository.ImagesRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Named


@HiltViewModel
class ImageListViewModel @Inject constructor(
    private val imagesRepositoryImpl: ImagesRepositoryImpl,
    @Named("api_key") private val apiKey: String
) : ViewModel() {

    val imagesList: MutableState<List<ResponseObject>> = mutableStateOf(listOf())

    init {
        getImages()
    }

    private fun getImages() {
        viewModelScope.launch {
            imagesList.value = imagesRepositoryImpl.getImages(apiKey)
        }
    }
}