package com.asr.aarohan

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class splashScreen : AppCompatActivity() {
    private var splashTimer: Timer? = null
    private val DELAY: Long = 5000
    private var scheduled = false
    var context: Context? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        context = this
        splashTimer = Timer()

        splashTimer!!.schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(context, HomeScreen::class.java)
                startActivity(intent)
                finish()
            }
        }, DELAY)
        scheduled = true

    }
}