package ru.netology.pract9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        showRandomNumber()
    }
    fun showRandomNumber(){
        val random = Random.nextInt(0,1000)
        var randomInt = Random.nextInt(0, random)
        val textViewRandom: TextView = findViewById(R.id.textView_random)
        val textViewLabel: TextView = findViewById(R.id.textView_label)
        textViewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading,random)
    }
}