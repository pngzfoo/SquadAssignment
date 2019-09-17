package com.example.testfragment.model

import com.google.gson.annotations.SerializedName

data class MobileModel(
    @SerializedName("brand")
    val brand: String,

    @SerializedName("thumbImageURL")
    val thumbImageURL: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("rating")
    val rating: Double?,

    @SerializedName("id")
    val id: String,

    @SerializedName("price")
    val price: String,

    @SerializedName("name")
    val name: String

)
