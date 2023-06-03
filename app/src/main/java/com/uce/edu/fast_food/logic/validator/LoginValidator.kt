package com.uce.edu.fast_food.logic.validator

import com.uce.edu.fast_food.entities.LoginUser

class LoginValidator {
    fun checkLogin(name:String, pass:String):Boolean{
        val admin = LoginUser()
        return (admin.nombre==name && admin.pass==pass)

    }
}