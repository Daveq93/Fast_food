package com.uce.edu.fast_food.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.uce.edu.fast_food.R
import com.uce.edu.fast_food.databinding.ActivityNuevaBinding

class Nueva : AppCompatActivity() {

    private lateinit var binding: ActivityNuevaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("UCE","Entrando al OnCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva)
        binding = ActivityNuevaBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        initClass()
    }

    fun initClass() {
        var button1 = binding.boton1n.setOnClickListener() {
            binding.textV.text = "probando mensaje"
           var textoObt = binding.edTxt.text.toString()

            var intent = Intent(
                this,
                MainActivity::class.java
            )//el MainActivity es la clase a la que se quiere llegar desde Nueva

          Log.d("UCE","Entrando al start")
           // intent.putExtra("str1","David extraido de la activity Nueva")
            intent.putExtra("str1",textoObt)
            startActivity(intent) //es necesario para iniciar el otro activity
        }


    }
}