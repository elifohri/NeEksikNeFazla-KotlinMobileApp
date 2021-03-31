package com.example.neeksiknefazla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup_client.*

class SignUpActivityClient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_client)

        textEmailClient.doOnTextChanged { text, start, before, count ->
            EmailClient.error = null
        }

        passwordTextClient.doOnTextChanged { text, start, before, count ->
            PasswordClient.error = null
        }

        buttonClientGo2.setOnClickListener {
            // SAYFA GECISI SAGLAMA
            val intent = Intent(this@SignUpActivityClient, LoginActivity::class.java)
            startActivity(intent)
            validate()
        }
    }

    private fun validate(){

        if (validateEmail().not()) return
        if (validatePassword().not()) return

        Toast.makeText(this,"Succesfully created a client's account!", Toast.LENGTH_SHORT).show()
    }

    private fun validateEmail():Boolean{

        val email = textEmailClient.text.toString()

        if (email.isEmpty()){
            EmailClient.error = getString(R.string.email_empty_error)
            return false
        }

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            EmailClient.error = getString(R.string.email_invalid_error)
            return false
        }
        EmailClient.error = null

        return true
    }

    private fun validatePassword():Boolean{
        val password = passwordTextClient.text.toString()

        if (password.length < 8){
            PasswordClient.error = getString(R.string.password_length_error)
            return false
        }

        PasswordClient.error = null

        return true
    }

    private fun toast(text: String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }

}