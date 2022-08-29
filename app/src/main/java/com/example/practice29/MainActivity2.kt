package com.example.practice29

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var nextbutton : Button? = null

    var country = arrayOf<String?>("India", "USA", "China", "Japan", "Other")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nextbutton = findViewById<View>(R.id.nxt) as Button

        nextbutton!!.setOnClickListener{
            var i = Intent(applicationContext, MainActivity3::class.java)
            startActivity(i)
        }


        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        val spin = findViewById<View>(R.id.spinner) as Spinner
        spin.onItemSelectedListener = this

        //Creating the ArrayAdapter instance having the country list
        val aa: ArrayAdapter<*> =
            ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, country)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //Setting the ArrayAdapter data on the Spinner
        spin.adapter = aa
    }

    //Performing action onItemSelected and onNothing selected
    override fun onItemSelected(arg0: AdapterView<*>?, arg1: View, position: Int, id: Long) {
        Toast.makeText(applicationContext, country[position], Toast.LENGTH_LONG).show()
    }

    override fun onNothingSelected(arg0: AdapterView<*>?) {
        // TODO Auto-generated method stub
    }


}