package com.example.newactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent(this, PicActivity::class.java)
            intent.putExtra(getString(R.string.linkCode),
                //"https://www.meme-arsenal.com/memes/b552b9775c5a4ed3de8f1cd9fc7c1a28.jpg")
            "https://sun9-32.userapi.com/impg/7hc7IwjaD5Gg7Q6AHYZoXEtpX9oVlzOj9O0Xwg/LV0jYiXEKO0.jpg?size=710x934&quality=96&sign=a3f1cc8bf7c83582afd37fa26c064237&type=album")
            startActivity(intent)
        }
    }
}