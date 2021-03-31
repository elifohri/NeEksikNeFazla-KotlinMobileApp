package com.example.neeksiknefazla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       /* textEmailLogin.doOnTextChanged { text, start, before, count ->
            Email.error = null
        }

        passwordText.doOnTextChanged { text, start, before, count ->
            Password.error = null
        }*/

        buttonClientGo1.setOnClickListener {
            // SAYFA GECISI SAGLAMA
            /*
            if ( kisi veritabanında client olarak kayıtlıysa ilki)
            val intent = Intent(this@LoginActivity, ClientHomePageActivity::class.java)
            startActivity(intent)
            else if(kisi veritabanında entreprise olarak kayitliysa)
            val intent = Intent(this@LoginActivity, EntrepriseHomePageActivity::class.java)
            startActivity(intent)
            else kisi kayıt olmadıysa giris yapamasın
            */
            //validate()
        }
    }

    /*private fun validate(){

        if (validateEmail().not()) return
        if (validatePassword().not()) return

        toast(getString(R.string.login_succesful))
    }

    private fun validateEmail():Boolean{
        val email = textEmailLogin.text.toString()

        if (email.isEmpty()){
            Email.error = getString(R.string.email_empty_error)
            return false
        }

        if (Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            Email.error = getString(R.string.email_invalid_error)
            return false
        }
        Email.error = null

        return true
    }

    private fun validatePassword():Boolean{
        val password = passwordText.text.toString()

        if (password.length < 8){
            Password.error = getString(R.string.password_length_error)
            return false
        }

        Password.error = null

        return true
    }

    private fun toast(text: String){
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show()
    }
*/
}