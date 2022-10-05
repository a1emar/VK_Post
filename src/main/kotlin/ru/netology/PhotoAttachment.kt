package ru.netology

class PhotoAttachment (
    override val type: String = "photo",
    val photo: Photo
    ) : Attachment {
}

data class Photo(
    val id: Int,
    val albumId: Int,
    val ownerId: Int,
    val userId: Int,
    val text: String,
    val date: Int,
    val sizes: String = "type_url_width_height",
    val width: Int,
    val height: Int
)

