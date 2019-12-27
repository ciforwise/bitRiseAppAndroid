package com.wisemotions.pocfirestorekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prova8: String

        val db = FirebaseFirestore.getInstance()

        val pippo:String


        startbtn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java).putExtra("value", "testok"))
        }

    }
}
