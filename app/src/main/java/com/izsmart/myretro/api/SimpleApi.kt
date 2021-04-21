package com.izsmart.myretro.api

import com.izsmart.myretro.models.Post
import retrofit2.Response
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Post

//    @GET("posts")
//    suspend fun getPosts(): Array<Post>
}

