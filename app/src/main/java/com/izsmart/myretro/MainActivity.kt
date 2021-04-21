package com.izsmart.myretro

import android.content.Context
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.izsmart.myretro.databinding.ActivityMainBinding
import com.izsmart.myretro.repositories.Repository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    lateinit var myContext: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        myContext = this

        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)

        viewModel.getPost()

        viewModel.myResponse.observe(this, Observer {response->
            Log.i("haha", response.toString())
        })

    }

//    fun play(view: View) {
//        GlobalScope.launch {val mediaPlayer:MediaPlayer? = MediaPlayer.create(applicationContext, Uri.parse("https://radio.hewadict.com/proxy/tislamradio?mp=/stream/;stream.mp3;nocache=65"))
//            mediaPlayer?.start()  }

//    }
}