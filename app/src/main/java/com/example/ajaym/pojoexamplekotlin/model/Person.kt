package com.example.ajaym.pojoexamplekotlin.model

 class Person {

     var age: Int = -1


         //============ this below creation of getter setter is automatic if you dont want to create it that is okey

         get() = field

     // setter
         set(value) {
             field = if(value <18)
                 12
             else
                 34
         }

 }