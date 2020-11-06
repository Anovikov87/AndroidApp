package ru.danger.AndroidApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val buttonPrev: Button = findViewById<Button>(R.id.button_third_prev)
        buttonPrev.setOnClickListener{
            moveToPrevScreen()
        }
        val buttonBack: Button = findViewById<Button>(R.id.button_third_back)
        buttonBack.setOnClickListener{
            moveToStartScreen()
        }
    }

    private fun moveToPrevScreen(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }

    private fun moveToStartScreen(){
        val intent = Intent(this,MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}