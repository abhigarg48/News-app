package com.example.newsapp

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author") val authorName:String,
    @SerializedName("title") val titleText:String,
    @SerializedName("description") val descText:String,
    @SerializedName("url") val articleUrl:String,
    @SerializedName("urlToImage") val imageUrl:String,
)

