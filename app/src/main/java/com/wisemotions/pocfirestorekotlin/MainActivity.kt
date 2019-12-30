package com.wisemotions.pocfirestorekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import io.flutter.embedding.android.FlutterActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prova10: String

        val db = FirebaseFirestore.getInstance()

        val pippoo: String


        startbtn.setOnClickListener {
            
            startActivity(FlutterActivity.withCachedEngine("my_engine_id")
                .build(this))
        }

    }
}
