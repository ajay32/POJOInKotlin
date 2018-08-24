package com.example.ajaym.pojoexamplekotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.ajaym.pojoexamplekotlin.model.Person
import com.example.ajaym.pojoexamplekotlin.model.User

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val user = User("ajay",12, "ajay@gmail.com", 9999999999)

        val p = Person();

// default age
         Toast.makeText(this@MainActivity2," ${p.age} ", Toast.LENGTH_SHORT).show()

        p.age = 24

        // we assigned 24 to age now printing again
        Toast.makeText(this@MainActivity2," ${p.age} ", Toast.LENGTH_SHORT).show()


        Toast.makeText(this@MainActivity2," ${user.age}  ${user.email}  " , Toast.LENGTH_SHORT).show()




    }
}
