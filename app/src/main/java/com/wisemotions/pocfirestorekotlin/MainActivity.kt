package com.wisemotions.pocfirestorekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prova: String

        val db = FirebaseFirestore.getInstance()

        val pippo:Int
    }
}
