package com.example.neeksiknefazla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.CheckBox
import android.widget.Toast
import androidx.constraintlayout.motion.widget.TransitionBuilder.validate
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup_client.*
import kotlinx.android.synthetic.main.activity_signup_enterprise.*

class SignUpActivityEnterprise : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_enterprise)


        emailEntreprise.doOnTextChanged { text, start, before, count ->
            EmailClient.error = null
        }

        passwordTextEntreprise.doOnTextChanged { text, start, before, count ->
            PasswordEntreprise.error = null
        }

        buttonEnterpriseGo.setOnClickListener {
            // SAYFA GECISI SAGLAMA
            val intent = Intent(this@SignUpActivityEnterprise, LoginActivity::class.java)
            startActivity(intent)
            validate()
        }
    }

    private fun validate(){

        if (validateEmail().not()) return
        if (validatePassword().not()) return

        Toast.makeText(this,"Succesfully created a company's account!", Toast.LENGTH_SHORT).show()
    }

    private fun validateEmail():Boolean{

        val email = emailEntreprise.text.toString()

        if (email.isEmpty()){
            EmailEntreprise.error = getString(R.string.email_empty_error)
            return false
        }

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            EmailEntreprise.error = getString(R.string.email_invalid_error)
            return false
        }
        EmailEntreprise.error = null

        return true
    }

    private fun validatePassword():Boolean{
        val password = passwordTextEntreprise.text.toString()

        if (password.length < 8){
            PasswordEntreprise.error = getString(R.string.password_length_error)
            return false
        }

        PasswordEntreprise.error = null

        return true
    }

    private fun toast(text: String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }

}