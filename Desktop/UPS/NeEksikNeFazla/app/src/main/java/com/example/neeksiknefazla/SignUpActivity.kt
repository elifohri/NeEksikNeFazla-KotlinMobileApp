package com.example.neeksiknefazla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signup.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        buttonClient.setOnClickListener {
            val intent = Intent(this@SignUpActivity, SignUpActivityClient::class.java)
            startActivity(intent)
        }

        buttonEnterprise.setOnClickListener {
            val intent = Intent(this@SignUpActivity, SignUpActivityEnterprise::class.java)
            startActivity(intent)
        }
    }
}