package com.iot.login_java_kotlin

import android.app.Fragment
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_menu.*

/**
 * Created by User on 2017-06-02.
 */

class MenuFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        var root : View = inflater.inflate(R.layout.fragment_menu, container, false)

        return root
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        btnBank.setOnClickListener {
            var intent = Intent(activity, MainActivity::class.java)
            startActivity(intent)
        }
    }

}
