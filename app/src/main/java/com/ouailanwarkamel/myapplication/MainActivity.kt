package com.ouailanwarkamel.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tvtwo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvtwo=findViewById(R.id.tvtwo)

        tvtwo.setOnClickListener {
            Toast.makeText(this, "something ....", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, FacebookActivity::class.java))
        }
    }
}
//override fun onCreate
/* *
* */

// the makeText() method takes the following parameters :
/*
* The application context
* the text that should appear to the user
* the duration that the toast should remain on the screen
*
* */
