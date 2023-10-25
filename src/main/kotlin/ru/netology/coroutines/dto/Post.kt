package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
    var author: Author? = null
)

data class Attachment(
    val url: String,
    val description: String,
    val type: String
)

data class Comment(
    val id: Long,
    val postId: Long,
    val authorId: Long,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var author: Author? = null
)

data class Author(
    val id: Long,
    val name: String,
    val avatar: String,
)