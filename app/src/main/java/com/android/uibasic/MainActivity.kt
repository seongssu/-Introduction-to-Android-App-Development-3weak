package com.android.uibasic

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(R.layout.text_views)
//        val myButton = findViewById<ImageButton>(R.id.imageButton)
//        myButton.isEnabled = false
//        focusableInTouchMode

    }

    fun imageButton1clicked(v: View) {
        Toast.makeText(this, "눌렀어요", Toast.LENGTH_SHORT).show()
    }
    //    fun imageButton1onclicked(v:View){
//        Toast.makeText(this,"알람이 울립니다.",Toast.LENGTH_SHORT).show()
//    }
//    fun imageButton1onclicked(v: View) {
//        val btn = Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"))
//        startActivity(btn)
//    }
}
