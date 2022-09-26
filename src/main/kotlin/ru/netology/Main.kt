package ru.netology

fun main() {
    WallService.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1,
        friendsOnly = false, comments = Comments(0, true, false, false, true),
        copyright = Copyright(1, "CprghtLink", "CprghtName", "CprghtType"), likes = Likes(0, false, false, false),
        reposts = Reposts(0, false), views = Views(1), postType = PostType.post, postSource = PostSource(Type.vk, Platform.android, Data.poll),
        geo = Geo("home", "12`12, 13`13", Place(1, "home", 1212, 1313, 1, "smile", 1, 1, 1, 46, 485, 1)),
        signerId = 1, copyHistory = arrayOf("1", "2", "3"), canPin = true, canDelete = true, canEdit = true, isPinned = 1, markedAsAds = false, isFavorite = false,
        donut = Donut(isDonut = false, paidDuration = 0, placeholder = "plag", canPublishFreeCopy = false, editMode = "all"), postponedId = 0))
    WallService.add(Post(id = 2, ownerId = 1, fromId = 1, createdBy = 99, date = 20220612, text = "Hello Kotlin", replyOwnerId = 1, replyPostId = 1,
        friendsOnly = false, comments = Comments(0, true, false, false, true),
        copyright = Copyright(1, "CprghtLink", "CprghtName", "CprghtType"), likes = Likes(0, false, false, false),
        reposts = Reposts(0, false), views = Views(1), postType = PostType.post, postSource = PostSource(Type.vk, Platform.android, Data.poll),
        geo = Geo("home", "12`12, 13`13", Place(1, "home", 1212, 1313, 1, "smile", 1, 1, 1, 46, 485, 1)),
        signerId = 1, copyHistory = arrayOf("1", "2", "3"), canPin = true, canDelete = true, canEdit = true, isPinned = 1, markedAsAds = false, isFavorite = false,
        donut = Donut(isDonut = false, paidDuration = 0, placeholder = "plag", canPublishFreeCopy = false, editMode = "all"), postponedId = 0))
    WallService.add(Post(id = 3, ownerId = 1, fromId = 2, createdBy = 99, date = 20220613, text = "Hello Java", replyOwnerId = 2, replyPostId = 1,
        friendsOnly = false, comments = Comments(0, true, false, false, true),
        copyright = Copyright(1, "CprghtLink", "CprghtName", "CprghtType"), likes = Likes(0, false, false, false),
        reposts = Reposts(0, false), views = Views(1), postType = PostType.reply, postSource = PostSource(Type.vk, Platform.android, Data.poll),
        geo = Geo("home", "12`12, 13`13", Place(1, "home", 1212, 1313, 1, "smile", 1, 1, 1, 46, 485, 1)),
        signerId = 1, copyHistory = arrayOf("1", "2", "3"), canPin = true, canDelete = true, canEdit = true, isPinned = 1, markedAsAds = false, isFavorite = false,
        donut = Donut(isDonut = false, paidDuration = 0, placeholder = "plag", canPublishFreeCopy = false, editMode = "all"), postponedId = 0))
    WallService.print()
//    object WallService {
//        private var post = emptyArray<Post>()
//    }
    WallService.update(Post(id = 0, ownerId = 1, fromId = 2, createdBy = 99, date = 20220614, text = "Hello Netology", replyOwnerId = 2, replyPostId = 1,
        friendsOnly = false, comments = Comments(0, true, false, false, true),
        copyright = Copyright(1, "CprghtLink", "CprghtName", "CprghtType"), likes = Likes(0, false, false, false),
        reposts = Reposts(0, false), views = Views(1), postType = PostType.reply, postSource = PostSource(Type.vk, Platform.android, Data.poll),
        geo = Geo("home", "12`12, 13`13", Place(1, "home", 1212, 1313, 1, "smile", 1, 1, 1, 46, 485, 1)),
        signerId = 1, copyHistory = arrayOf("1", "2", "3"), canPin = true, canDelete = true, canEdit = true, isPinned = 1, markedAsAds = false, isFavorite = false,
        donut = Donut(isDonut = false, paidDuration = 0, placeholder = "plag", canPublishFreeCopy = false, editMode = "all"), postponedId = 0))
    WallService.print()
//    println(WallService.posts.last())
}