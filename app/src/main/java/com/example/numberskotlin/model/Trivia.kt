package com.example.numberskotlin.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Trivia(
    var text: String,
    var number: Int,
    var found: Boolean,
    var type: String
) : Parcelable

