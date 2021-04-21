package com.izsmart.myretro.models

import com.google.gson.annotations.SerializedName

/*
    {
  "userId": 1,
  "id": 1,
  "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
  "body": "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
    }
*/
 data class Post(
//    @SerializedName("userId") // for changing the name according to your choice
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
)