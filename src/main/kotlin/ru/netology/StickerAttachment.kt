package ru.netology

class StickerAttachment(
    override val type: String = "stiker",
    val stiker: Stiker
) : Attachment {
}

data class Stiker(
    val productId: Int,
    val stickerId: Int,
    val images: String = "url_wigth_height",
    val imagesWithBackground: String = "url_wigth_height",
    val animationUrl: String,
    val isAllowed: Boolean
)