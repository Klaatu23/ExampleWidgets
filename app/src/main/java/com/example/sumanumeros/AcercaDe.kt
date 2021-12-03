package com.example.sumanumeros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AcercaDe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de)
        val bundle = intent.extras
        val name = bundle?.getString("nombre")
        val textView = findViewById<TextView>(R.id.tvt1)
        val button = findViewById<Button>(R.id.button2)


        textView.setText(name)



        button.setOnClickListener{
            finish()
        }

    }
}