package com.example.techtrain.railway.android

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.text).text = getString(R.string.main_text)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            Log.d("edit/text", findViewById<EditText>(R.id.plain_text_edit).text.toString())
            findViewById<TextView>(R.id.text).text =
                findViewById<EditText>(R.id.plain_text_edit).text.toString()
        }
    }
}
