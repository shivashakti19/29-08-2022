package com.example.practice29

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var closeButton: Button? = null
    var nextbutton : Button? = null
    var builder: AlertDialog.Builder? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        closeButton = findViewById<View>(R.id.button) as Button
        nextbutton = findViewById<View>(R.id.nxt) as Button
        builder = AlertDialog.Builder(this)
        closeButton!!.setOnClickListener { //Uncomment the below code to Set the message and title from the strings.xml file
           // builder.setMessage(R.string.dialog_message).setTitle(R.string.dialog_title)

            //Setting message manually and performing action on button click
            builder!!.setMessage("Do you want to close this application ?")
                .setCancelable(false)
                .setPositiveButton(
                    "Yes"
                ) { dialog, id ->
                    finish()
                    Toast.makeText(
                        applicationContext, "you choose yes action for alertbox",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                .setNegativeButton(
                    "No"
                ) { dialog, id -> //  Action for 'NO' Button
                    dialog.cancel()
                    Toast.makeText(
                        applicationContext, "you choose no action for alertbox",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            //Creating dialog box
            val alert = builder!!.create()
            //Setting the title manually
            alert.setTitle("AlertDialogExample")
            alert.show()


            nextbutton!!.setOnClickListener{
                var i = Intent(applicationContext, MainActivity2::class.java)
                startActivity(i)
            }
        }
    }
}


