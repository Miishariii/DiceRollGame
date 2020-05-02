package com.example.dicerollgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice: ImageView =findViewById(R.id.dice)
        val reset: Button =findViewById(R.id.reset)

        val d1: TextView =findViewById(R.id.d_1)
        val d2: TextView =findViewById(R.id.d_2)
        val d3: TextView =findViewById(R.id.d_3)
        val d4: TextView =findViewById(R.id.d_4)
        val d5: TextView =findViewById(R.id.d_5)
        val d6: TextView =findViewById(R.id.d_6)

        var temp="hi"

        dice.setOnClickListener(View.OnClickListener {
            val rand = Random.nextInt(1, 7)

            if(rand==1) {
                dice.setImageResource(R.drawable.die1);
                temp=d1.text.toString()
                d1.setText((temp.toInt()+1).toString())
            }
            else if(rand==2) {
                dice.setImageResource(R.drawable.die2);
                temp=d2.text.toString()
                d2.setText((temp.toInt()+1).toString())
            }
            else if(rand==3) {
                dice.setImageResource(R.drawable.die3);
                temp=d3.text.toString()
                d3.setText((temp.toInt()+1).toString())
            }
            else if(rand==4) {
                dice.setImageResource(R.drawable.die4);
                temp=d4.text.toString()
                d4.setText((temp.toInt()+1).toString())
            }
            else if(rand==5) {
                dice.setImageResource(R.drawable.die5);
                temp=d5.text.toString()
                d5.setText((temp.toInt()+1).toString())
            }
            else{
                dice.setImageResource(R.drawable.die6);
                temp=d6.text.toString()
                d6.setText((temp.toInt()+1).toString())

            }
        })

        reset.setOnClickListener(View.OnClickListener {
            d1.setText("0")
            d2.setText("0")
            d3.setText("0")
            d4.setText("0")
            d5.setText("0")
            d6.setText("0")
        })

    }

}
