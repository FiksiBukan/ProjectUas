package com.fiksi.project_uas.model

import android.os.Parcelable
import com.fiksi.uas.model.tv
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class tvresponse(
    @SerializedName("results")
    val tv : List<tv>

) : Parcelable {
    constructor() : this(mutableListOf())
}