package com.example.guessinggameupdated

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    var numberEntered = 0;
    var numberOfChances=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val answerGuessed = findViewById<TextInputEditText>(R.id.answerET)
        val rightButton = findViewById<TextView>(R.id.questionTV2)
        val suggestion = findViewById<TextView>(R.id.suggestionTV3)

        val randomNumber = (0..1000).random()

        rightButton.setOnClickListener {

            if ((answerGuessed.text.toString().isNullOrEmpty()) or (answerGuessed.text.toString().toInt() > 1000)){
                suggestion.text = "Please enter a number between 0 to 1000"
            }else {
                numberEntered = answerGuessed.text.toString().toInt()

                if (numberEntered == randomNumber)
                {
                    val winIntent = Intent(this, WinActivity::class.java)
                    winIntent.putExtra("number", randomNumber)
                    startActivity(winIntent)
                } else if (numberEntered > randomNumber) {
                    suggestion.text = "No :) My number is smaller"
                } else if (numberEntered < randomNumber) {
                    suggestion.text = "No :) My number is bigger"
                }

                numberOfChances++
                if(numberOfChances == 12)
                {
                    val lostIntent = Intent(this, LostActivity::class.java)
                    lostIntent.putExtra("number", randomNumber)
                    startActivity(lostIntent)
                }

            }
        }}
}