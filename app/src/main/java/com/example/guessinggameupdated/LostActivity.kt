package com.example.guessinggameupdated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lost)

        val number = intent.getIntExtra("number",0)
        findViewById<TextView>(R.id.numberTV).text = "$number"
    }
}