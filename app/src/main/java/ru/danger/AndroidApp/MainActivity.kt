package ru.danger.AndroidApp

import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<Button>(R.id.button_first)
        button.setOnClickListener{
            moveToNextScreen()
        }
    }

    private fun moveToNextScreen(){
        val intent = Intent(this,SecondActivity::class.java)
        startActivity(intent)
    }
}