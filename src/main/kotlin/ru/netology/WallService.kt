package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size)
        return posts.last()
    }
    fun update(postUp: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postUp.id) {
                posts[index] = postUp.copy(id = post.id, ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }
    fun print() {
        for (post in posts) println(post)
    }
}