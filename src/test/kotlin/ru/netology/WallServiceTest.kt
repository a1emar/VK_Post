package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_post() {
        //arrange
        val service = WallService

        //act
        val postNew = service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))

        //assert
        assertTrue(postNew.id == 0)
    }

    @Test
    fun update_postTrue() {
        //arrange
        val service = WallService
        val postNew1 = service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))
        val postNew2 = service.add(Post(id = 2, ownerId = 1, fromId = 1, createdBy = 99, date = 20220612, text = "Hello Kotlin", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))
        val postNew3 = service.add(Post(id = 3, ownerId = 1, fromId = 2, createdBy = 99, date = 20220613, text = "Hello Java", replyOwnerId = 2, replyPostId = 1, friends_only = false, postType = PostType.reply))


        //act
        val result = service.update(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220612, text = "Hello Kotlin", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))

        //assert
        assertTrue(result)
    }
    @Test
    fun update_postFalse() {
        //arrange
        val service = WallService
        val postNew1 = service.add(Post(id = 1, ownerId = 1, fromId = 1, createdBy = 99, date = 20220611, text = "Hello world", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))
        val postNew2 = service.add(Post(id = 2, ownerId = 1, fromId = 1, createdBy = 99, date = 20220612, text = "Hello Kotlin", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))
        val postNew3 = service.add(Post(id = 3, ownerId = 1, fromId = 2, createdBy = 99, date = 20220613, text = "Hello Java", replyOwnerId = 2, replyPostId = 1, friends_only = false, postType = PostType.reply))


        //act
        val result = service.update(Post(id = 4, ownerId = 1, fromId = 1, createdBy = 99, date = 20220612, text = "Hello Kotlin", replyOwnerId = 1, replyPostId = 1, friends_only = false, postType = PostType.post))

        //assert
        assertFalse(result)
    }
}