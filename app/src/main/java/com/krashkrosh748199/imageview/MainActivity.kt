package com.krashkrosh748199.imageview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.coroutines.processNextEventInCurrentThread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val btnFirst=findViewById<Button>(R.id.btnImage)
        val ivFirst=findViewById<ImageView>(R.id.ivImage)
val btnSecond=findViewById<Button>(R.id.btnImageA)

        btnFirst.setOnClickListener{
            ivFirst.setImageResource(R.drawable.mst)

        }
        btnSecond.setOnClickListener{
          ivFirst.setImageResource(R.drawable.bonafide)
        }

    }
}