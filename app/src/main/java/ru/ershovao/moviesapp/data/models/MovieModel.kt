package ru.ershovao.moviesapp.data.models

data class MovieModel(
    val _id: String,
    val id: String,
    val originalTitleText: OriginalTitleText,
    val primaryImage: PrimaryImage,
    val releaseDate: Any,
    val releaseYear: ReleaseYear,
    val titleText: TitleText,
    val titleType: TitleType
)