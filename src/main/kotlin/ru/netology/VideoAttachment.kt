package ru.netology

class VideoAttachment (
    override val type: String = "video",
    val video: Video
    ) : Attachment {
}

data class Video(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val description: String,
    val duration: Int,
    val image: Array<Image> = emptyArray(),
    val firstFrame: Array<FirstFrame> = emptyArray(),
    val date: Int,
    val addingDate: Int,
    val views: Int,
    val localViews: Int,
    val comments: Int,
    val player: String,
    val platform: String,
    val canAdd: Boolean,
    val isPrivate: Boolean? = true,
    val accessKey: String,
    val processing: Int,
    val isFavorite: Boolean,
    val canComment: Boolean,
    val canEdit: Boolean,
    val canLike: Boolean,
    val canRepost: Boolean,
    val canSubscribe: Boolean,
    val canAddToFaves: Boolean,
    val canAttachLink: Boolean,
    val width: Int,
    val height: Int,
    val userId: Int,
    val converting: Boolean,
    val added: Boolean,
    val isSubscribed: Boolean,
    val repeat: Int,
    val type: TypeVideo,
    val balance: Int,
    val liveStatus: LiveStatus,
    val live: Int?,
    val upcoming: Int?,
    val spectators: Int,
    val likes: Int,
    val reposts: Int
)