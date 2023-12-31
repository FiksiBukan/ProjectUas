package com.fiksi.project_uas.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MovieResponse(
    @SerializedName("results")
    val movies : List<movie>

) : Parcelable {
    constructor() : this(mutableListOf())
}