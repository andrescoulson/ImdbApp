package com.andrecoulson.themovieadb.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.andrecoulson.themovieadb.R
import com.andrecoulson.themovieadb.ui.main.MainActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        try {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        } catch (ex: Exception) {
            ex.printStackTrace()
        }

        startActivity(Intent(this, MainActivity::class.java))
        finish()

    }
}
