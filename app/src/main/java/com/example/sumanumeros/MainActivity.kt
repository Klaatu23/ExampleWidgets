package com.example.sumanumeros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //declaracion de los widgets
        val boton = findViewById<Button>(R.id.button)
        val boton2 = findViewById<Button>(R.id.button2)
        val txt = findViewById<TextView>(R.id.texto)
        val edit1 = findViewById<EditText>(R.id.edt1)
        val edit2 = findViewById<EditText>(R.id.edt2)
        
        //Declaración de variables
        var suma = 0
        var resta= 0

        //Boton proceso Suma
            boton.setOnClickListener {

                var n1 = edt1.text.toString().toInt()
                var n2 = edt2.text.toString().toInt()
                 suma = n1 + n2

             txt.setText(suma.toString())
        }

        //Boton proceso Resta
        boton2.setOnClickListener {

            var n1 = edt1.text.toString().toInt()
            var n2 = edt2.text.toString().toInt()
            suma = n1 - n2

            txt.setText(suma.toString())

        }

    }

}