package com.example.navegarentreactivitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("MESSAGE")
        val textView = findViewById<TextView>(R.id.secondActivityTextView)
        textView.setText(message)
    }
}