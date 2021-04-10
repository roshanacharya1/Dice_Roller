package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    lateinit var image_roll:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonroll:Button= findViewById(R.id.button_roll)
        buttonroll.setOnClickListener{
            roll()
        }
        image_roll=findViewById(R.id.Image_roll)

    }

    private fun roll() {
//val image_roll:ImageView=findViewById(R.id.Image_roll)
        val value= Random().nextInt(6)+1
        val drawimg = when(value){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
                3->R.drawable.dice_3
            4->R.drawable.dice_4

            5->R.drawable.dice_5
                6->R.drawable.dice_6

            else -> R.drawable.dice_6
        }
        image_roll.setImageResource(drawimg)

    }
}