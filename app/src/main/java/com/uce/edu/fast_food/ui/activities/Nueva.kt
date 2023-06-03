package com.uce.edu.fast_food.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import com.uce.edu.fast_food.R
import com.uce.edu.fast_food.databinding.ActivityNuevaBinding
import com.uce.edu.fast_food.logic.validator.LoginValidator
import javax.xml.validation.Validator

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
            //binding.textV.text = "probando mensaje"
          // var textoObt = binding.edTxt.text.toString()

            val check = LoginValidator().checkLogin(
                binding.txtName.text.toString(),
                binding.txtPass.text.toString()
            )
//            if(binding.txtName.text.toString()=="admin"
//                && binding.txtPass.text.toString()=="123"){
//                var intent = Intent(
//                    this,
//                    MainActivity::class.java
//                )//el MainActivity es la clase a la que se quiere llegar desde Nueva
//
//                intent.putExtra("var1","")e
//                intent.putExtra("var2",2)
//                startActivity(intent)
//            }else{
//                Snackbar.make(binding.textView1,"Usuario y pass incorrecto",3)
//            }
            if(check){
                var intent = Intent(
                    this,
                    MainActivity::class.java
                )//el MainActivity es la clase a la que se quiere llegar desde Nueva

                intent.putExtra("var1","")
                intent.putExtra("var2",2)
                startActivity(intent)
            }else{
                Snackbar.make(binding.textView1,"Usuario y pass incorrecto",Snackbar.LENGTH_LONG).show()
            }
//          Log.d("UCE","Entrando al start")
//           // intent.putExtra("str1","David extraido de la activity Nueva")
//            //intent.putExtra("str1",textoObt)
//            startActivity(intent) //es necesario para iniciar el otro activity
        }


    }
}