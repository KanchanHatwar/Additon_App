package com.example.additon_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var num1:EditText=findViewById(R.id.etnumber1)

        var num2:EditText=findViewById(R.id.etNumber2)

        var b1:Button=findViewById(R.id.btn_cal)


         var r1:TextView=findViewById(R.id.tvresult)


        b1.setOnClickListener(){

            val mynum1 : Int = ((num1.text).toString()).toInt()
            val mynum2  : Int =((num2.text).toString()).toInt()

            val mynum3 : Int= mynum1+mynum2
            r1.text= mynum3.toString()

        }
    }
}