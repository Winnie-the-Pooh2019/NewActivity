package com.example.newactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import java.net.URL

class PicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic)

        val link = intent.getStringExtra(getString(R.string.linkCode))
        Glide.with(this)
            .load(link)
            .placeholder(R.mipmap.herewego)
            .into(findViewById(R.id.imageView))
    }
}