package com.iot.login_java_kotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        btnBank.setOnClickListener {
            val intent = Intent(applicationContext as Context, MainActivity::class.java)
            startActivity(intent)

        }

        btnOff.setOnClickListener {


        }
    }
}
