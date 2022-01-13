package com.wdretzer.viewpagerexemplo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wdretzer.viewpagerexermplo.R

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Desabilita a Action Bar que exibe o nome do Projeto:
        getSupportActionBar()?.hide()
    }
}
