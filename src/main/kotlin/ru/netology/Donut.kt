package ru.netology

data class Donut(
    val isDonut: Boolean,
    val paidDuration: Int,
    val placeholder: String, // object заглушка
    val canPublishFreeCopy: Boolean,
    val editMode: String // all duration
)
