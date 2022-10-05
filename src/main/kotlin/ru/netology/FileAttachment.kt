package ru.netology

class FileAttachment(
    override val type: String = "file",
    val file: File
) : Attachment {
}
data class File(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
    val type: Int,
    val preview: String
)