package com.lukewiwa.spongebobify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SpongebobifiedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spongebobified)
        getText()
    }

    companion object {
        const val SPONGEBOBIFIED_TEXT = "spongebobified_text"
    }

    fun getText() {
        val text = intent.getStringExtra(SPONGEBOBIFIED_TEXT)

        val SbTextView = findViewById<TextView>(R.id.spongebobifiedText)
        SbTextView.text = text
    }
}
