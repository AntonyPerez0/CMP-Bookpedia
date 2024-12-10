package com.plcoding.bookpedia.domain

data class Book(
    val id: String,
    val title: String,
    val imageURL: String,
    val authors: List<String>,
    val description: String?,
    val languages: List<String>,
    val firstPublishYear: String?,
    val averageRating: Double?,
    val ratingsCount: Int?,
    val numPages: Int?,
    val numEditions: Int
)
