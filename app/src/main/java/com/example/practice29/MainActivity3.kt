package com.example.practice29

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
    var language = arrayOf("C", "C++", "Java", ".NET", "iPhone", "Android", "ASP.NET", "PHP")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        //Creating the instance of ArrayAdapter containing list of language names
        val adapter = ArrayAdapter(this, android.R.layout.select_dialog_item, language)
        //Getting the instance of AutoCompleteTextView
        val actv = findViewById<View>(R.id.autoCompleteTextView) as AutoCompleteTextView
        actv.threshold = 1 //will start working from first character
        actv.setAdapter(adapter) //setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED)
    }
}