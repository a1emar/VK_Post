package ru.netology

fun main() {
    WallService.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))
    WallService.add(Post(id = 2, ownerId = 1, fromId = 1, createdBy = 99, date = 20220612, text = "Hello Kotlin", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))
    WallService.add(Post(id = 3, ownerId = 1, fromId = 2, createdBy = 99, date = 20220613, text = "Hello Java", replyOwnerId = 2, replyPostId = 1, friends_only = false, postType = PostType.reply))
    WallService.print()
//    object WallService {
//        private var post = emptyArray<Post>()
//    }
    WallService.update(Post(id = 0, ownerId = 1, fromId = 2, createdBy = 99, date = 20220614, text = "Hello Netology", replyOwnerId = 2, replyPostId = 1, friends_only = false, postType = PostType.reply))
    WallService.print()
//    println(WallService.posts.last())
}