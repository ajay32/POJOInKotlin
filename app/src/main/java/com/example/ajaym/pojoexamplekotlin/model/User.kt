package com.example.ajaym.pojoexamplekotlin.model

// you could provide default value if you want

// you could also create constructor with data as prefix with class n u then u have to pass value in constructor
data class User(val name: String  = "ajay mehta", val age: Int, val email: String, val phone: Long)