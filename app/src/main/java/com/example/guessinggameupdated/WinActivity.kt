package com.example.guessinggameupdated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class WinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        val number = intent.getIntExtra("number",0)
        findViewById<TextView>(R.id.numberTV2).text = "$number"
    }
}