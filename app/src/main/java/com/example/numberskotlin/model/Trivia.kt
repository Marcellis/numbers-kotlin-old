package com.example.numberskotlin.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Trivia(
    @SerializedName("text") var text: String,
    @SerializedName("number") var number: Int,
    @SerializedName("found") var found: Boolean,
    @SerializedName("type") var type: String
) : Parcelable

