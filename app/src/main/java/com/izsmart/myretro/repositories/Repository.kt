package com.izsmart.myretro.repositories

import com.izsmart.myretro.api.RetrofitInstance
import com.izsmart.myretro.models.Post

class Repository {

    suspend fun getPost(): Post {
      return  RetrofitInstance.api.getPost()
    }
}