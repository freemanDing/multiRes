package com.dgs.multires

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = when (BuildConfig.FLAVOR_type) {
            "phone" -> {
                ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
            }
            else -> {
                ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
            }
        }
        val tvTest = findViewById<TextView>(R.id.tv_test)
        Toast.makeText(this, tvTest.text, Toast.LENGTH_LONG).show()

        Toast.makeText(this, tv_test.text, Toast.LENGTH_LONG).show()
    }
}