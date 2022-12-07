package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to all views
        var username = findViewById(R.id.username) as EditText
        var password = findViewById(R.id.password) as EditText
        var btn_login = findViewById(R.id.login) as Button
        var forgot_password = findViewById(R.id.forgot_pass) as TextView
        var showhide = findViewById(R.id.showhide) as ImageView

        var hide: Boolean = true


        // set on-click listener
        // username : deniz
        // password : 123
        btn_login.setOnClickListener {

            // if username and password correct
            if(username.text.toString() == "deniz" && password.text.toString() == "123") {
                var message_login = "Login Successfully"
                Toast.makeText(this@MainActivity, message_login, Toast.LENGTH_LONG).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else {
                var message_login_failed = "Login Failed.Check your username and password again."
                Toast.makeText(this@MainActivity, message_login_failed, Toast.LENGTH_LONG).show()
            }


        }
        forgot_password.setOnClickListener {
            var message_forgot_passwprd = "Check your email"
            Toast.makeText(this@MainActivity, message_forgot_passwprd, Toast.LENGTH_LONG).show()
        }

        showhide.setOnClickListener {
            if(hide) {
                //show password
                password.transformationMethod = PasswordTransformationMethod.getInstance()

                hide = false
            }else {
                // hide password
                password.transformationMethod = HideReturnsTransformationMethod.getInstance()
                hide = true
            }
        }

    }
}