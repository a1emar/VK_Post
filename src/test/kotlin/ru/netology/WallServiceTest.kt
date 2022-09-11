package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_post() {
        //arrange
        var posts = emptyArray<Post>()
        val expectedRes = Post(id = 0, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post)

        //act
        WallService.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))

        //assert
        assertEquals(expectedRes, posts[0])
    }

    @Test
    fun update_post() {

    }
}