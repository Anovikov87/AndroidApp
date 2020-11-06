package ru.danger.AndroidApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button: Button = findViewById<Button>(R.id.button_second_prev)
        button.setOnClickListener{
            moveToPrevScreen()
        }
        val buttonNext: Button = findViewById<Button>(R.id.button_second_next)
        buttonNext.setOnClickListener{
            moveToNextScreen()
        }
    }

    private fun moveToPrevScreen(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }

    private fun moveToNextScreen(){
        val intent = Intent(this,ThirdActivity::class.java)
        startActivity(intent)
    }
}