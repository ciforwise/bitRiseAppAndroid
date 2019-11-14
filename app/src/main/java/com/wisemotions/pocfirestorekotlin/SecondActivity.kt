package com.wisemotions.pocfirestorekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val intent = intent
        val user_name = intent.getStringExtra("values")
        Toast.makeText(this, user_name.length.toString(), Toast.LENGTH_SHORT).show()

    }
}
