package com.example.stageusgen8

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.login_fragment, container, false)
        initEvent(view)

        return view
    }

    fun initEvent(myView: View) {
        val loginButton = myView.findViewById<Button>(R.id.login_button)
        loginButton.setOnClickListener {
            val intent = Intent(context, ContentActivity::class.java)
            startActivity(intent)
        }
    }
}