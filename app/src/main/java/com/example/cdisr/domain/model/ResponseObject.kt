package com.example.cdisr.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ResponseObject(
    val id: String?,
    val url: Urls?
) : Parcelable