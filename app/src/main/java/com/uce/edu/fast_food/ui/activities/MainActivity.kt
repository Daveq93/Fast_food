package com.uce.edu.fast_food.ui.activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.uce.edu.fast_food.R
import com.uce.edu.fast_food.databinding.ActivityMainBinding
import com.uce.edu.fast_food.databinding.ActivityNuevaBinding

class MainActivity : AppCompatActivity() {
    //es una variable de que va a iniciar algo
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)/*La letra R es la clase que ya viene en el android, la cual define todos
//                                                los recursos o da acceso a todos los recursos que estan en la carpeta res*/
//       var boton1 = findViewById<ImageButton>(R.id.boton1)
//        var txtView=findViewById<TextView>(R.id.txtView2)
//
//        var txtBuscar = findViewById<SearchView>(R.id.txtBuscar)
//
//        boton1.setOnClickListener{
//
//            txtView.text = "Muestra busqueda"
//            Toast.makeText(this, "Ejemplo de un toast", Toast.LENGTH_SHORT).show()
//
//            var f = Snackbar.make(boton1,"Ejemplo de snackbar",Snackbar.LENGTH_LONG)
//
//            f.setBackgroundTint(ContextCompat.getColor(this,R.color.snakColor)).show()
//        }
    }

    override fun onStart() {
        super.onStart()
//        var name:String =""
//        intent.extras.let {
//           name = it?.getString("str1")!!
//            binding.txtView2.text=name
//        }

        initClass()
    }

    //REVISAR SCOPE FUNCTIONS
    fun initClass() {
        var boton2 = binding.boton1.setOnClickListener {
            //   txtView.text = "Muestra busqueda"
            binding.txtView2.text = "Codigo ejecutado correctamente"
            Toast.makeText(this, "Ejemplo de un toast", Toast.LENGTH_SHORT).show()
            var f = Snackbar.make(binding.boton1, "Ejemplo de snackbar", Snackbar.LENGTH_LONG)
            f.setBackgroundTint(ContextCompat.getColor(this, R.color.snakColor)).show()


        }

        var botonVolver = binding.btnVolver.setOnClickListener {
            var intent = Intent(this, Nueva::class.java)

            startActivity(intent)

        }

        var name: String = ""
        intent.extras.let {
            name = it?.getString("str1")!!
            binding.txtView2.text = name
        }

    }

    private fun initService() {

    }


}