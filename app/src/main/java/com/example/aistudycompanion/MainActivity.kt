package com.example.aistudycompanion

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputText = findViewById<EditText>(R.id.inputText)
        val askButton = findViewById<Button>(R.id.askButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        askButton.setOnClickListener {
            val userInput = inputText.text.toString()
            val fakeAIResponse = generateFakeAIResponse(userInput)
            resultText.text = fakeAIResponse
        }
    }

    private fun generateFakeAIResponse(input: String): String {
        return if (input.isNotEmpty()) {
            "AI Summary:\n$input\n\n(This is a simulated AI response using Llama 3.2 concept)"
        } else {
            "Please enter some text."
        }
    }
}