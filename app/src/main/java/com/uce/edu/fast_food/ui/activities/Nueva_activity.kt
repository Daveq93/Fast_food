package com.uce.edu.fast_food.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.uce.edu.fast_food.R
import com.uce.edu.fast_food.databinding.ActivityMainBinding

class nueva_activity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    setContentView(R.layout.activity_nueva)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    override fun onStart(){
        super.onStart()
     initClass()
    }

    fun initClass(){
        var button1 = binding.button1.setOnClickListener(){
            binding.textView2.text = "probando mensaje"
        }
    }

}