package com.example.practicumexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView

class DetailedScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailedscreen)
        val temperturesArray=intent.getFloatArrayExtra("Temperture")
        val weatherCondition=intent.getStringArrayExtra("weather condition ")
        if (temperturesArray!=null&&weatherCondition!=null){
            val weatherDetails= mutableListOf<String>()
            for (i in temperturesArray.indices){
                weatherDetails.add("DAYS${i+1}:$ {temperturesArray[i]}c-${weatherCondition}[i]")
                val weatherListView = findViewById<EditText>(R.id.weatherListviwe)
                val adapter=ArrayAdapter(this , android.R.layout.simple_list_item_1,weatherDetails)

            }

            }
    }
}