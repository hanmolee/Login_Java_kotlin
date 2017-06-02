package com.iot.login_java_kotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast


class LoginActivity : AppCompatActivity() {

    val SUBMIT : Int = 1000
    val PASSWORD : String = "12"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        submitBtn.setOnClickListener {

            val Input_PW = fingerprintInput.text//입력받은 비밀번호를 변수에 저장

            if (PASSWORD.equals(Input_PW.toString())){//입력한 비밀번호가 맞다면

                val fragmentManager = supportFragmentManager
                val fragmentTransaction = fragmentManager.beginTransaction()
                val menufragment = fragmentManager.findFragmentById(R.id.fragment_one) as MenuFragment
                fragmentTransaction.add(menufragment as Fragment,"")

                fragmentTransaction.commit()

            }
            else
                toast("Try Again")

        }

    }
}
