package com.lukewiwa.spongebobify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.spongebobify_button)
        button.setOnClickListener {
            convertText()
        }

    }

    fun convertText() {

        val inputView by lazy { findViewById<EditText>(R.id.input_text) }
        val outputText = spongebobifyText(inputView.text.toString())

        val spongebobifyIntent = Intent(this, SpongebobifiedActivity::class.java)
        spongebobifyIntent.putExtra(SpongebobifiedActivity.SPONGEBOBIFIED_TEXT, outputText)
        startActivity(spongebobifyIntent)
    }

    fun spongebobifyText(input: String): String {
        val output = StringBuilder()
        for ((index, character) in input.withIndex()){
            if (index % 2 == 0){
                output.append(character.toUpperCase().toString())
            } else {
                output.append(character.toLowerCase().toString())
            }
        }
        return output.toString()
    }
}
