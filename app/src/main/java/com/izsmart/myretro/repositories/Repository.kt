package com.izsmart.myretro.repositories

import com.izsmart.myretro.api.RetrofitInstance
import com.izsmart.myretro.models.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(): Response<Post> {
      return  RetrofitInstance.api.getPost()
    }
}