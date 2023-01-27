package com.example.a28_fanshop.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fan(
    val name: String,
    val price: Double,
    val imageResource: Int,
    val description: String,
    val isSale: Boolean
) : Parcelable
