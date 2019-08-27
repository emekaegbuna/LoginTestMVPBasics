package com.example.loginmvp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.loginmvp.R
import com.example.loginmvp.presenter.Presenter
import com.example.loginmvp.presenter.ViewInterface
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ViewInterface {
    override fun onSuccess() {
        Toast.makeText(this, "login success", Toast.LENGTH_SHORT).show()
    }

    var presenter = Presenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener {
            var email = et_user_email.text.toString()
            var password = et_use_password.text.toString()
            presenter.onExecute(email, password)
        }


    }
}
