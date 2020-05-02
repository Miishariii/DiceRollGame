package com.example.dicerollgame

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class StartPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_page)
        val start: ImageView =findViewById(R.id.starting)
        val end: ImageView =findViewById(R.id.ending)

        start.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        end.setOnClickListener(View.OnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setMessage("Are you sure you want to exit?")


            builder.setPositiveButton("Yes") { dialog, which ->
                finishAffinity()
            }

            builder.setNegativeButton("No") { dialog, which ->

            }

            builder.show()
        })


    }
}