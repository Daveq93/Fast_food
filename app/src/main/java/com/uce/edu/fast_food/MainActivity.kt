package com.uce.edu.fast_food

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)/*La letra R es la clase que ya viene en el android, la cual define todos
                                                los recursos o da acceso a todos los recursos que estan en la carpeta res*/
       var boton1 = findViewById<ImageButton>(R.id.boton1)
        var txtView=findViewById<TextView>(R.id.txtView2)

        var txtBuscar = findViewById<SearchView>(R.id.txtBuscar)



        boton1.setOnClickListener{
            txtView.text = "Muestra busqueda"
            Toast.makeText(this, "hola ejem", Toast.LENGTH_SHORT).show()
          var f = Snackbar.make(boton1,"Este es otro mensaje",Snackbar.LENGTH_LONG)
            f.setBackgroundTint(ContextCompat.getColor(this,R.color.snakColor)).show()
        }
    }
}