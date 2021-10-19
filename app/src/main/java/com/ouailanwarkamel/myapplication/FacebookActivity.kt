package com.ouailanwarkamel.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_facebook.*

class FacebookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facebook)

        supportActionBar?.hide()                        // Remove( hide) the action bar

        btn_login.setOnClickListener {
            val email = edt_email.text.toString()       // get email from  Edit text and convert to String
            val password = edt_password.text.toString() // get email from  Edit text and convert to String

            if (email.isEmpty()) {                      // check if email is empty
                edt_email.error = "Email Required"      // display error message in the Edit text
                return@setOnClickListener               // exit
            }
            if (password.isEmpty()) {                     // check if password is empty
                edt_password.error = "Password Required"  // display error message in the Edit text
                return@setOnClickListener                 // exit
            }

            // Display email and password
            Toast.makeText(this, "$email \n $password", Toast.LENGTH_SHORT).show()
        }
    }
}