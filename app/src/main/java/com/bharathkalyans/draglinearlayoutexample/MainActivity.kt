package com.bharathkalyans.draglinearlayoutexample

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jmedeisis.draglinearlayout.DragLinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dragLinearLayout : DragLinearLayout = findViewById(R.id.container)

        for (i in 0 until dragLinearLayout.childCount -1 ) {
            val child: View = dragLinearLayout.getChildAt(i)
            dragLinearLayout.setViewDraggable(child, child) // the child is its own drag handle
        }


        setListeners()
    }

    private fun setListeners(){

        text_view_1.setOnClickListener { changeColor(it) }
        text_view_2.setOnClickListener { changeColor(it) }
        text_view_3.setOnClickListener { changeColor(it) }
        text_view_4.setOnClickListener { changeColor(it) }
        text_view_5.setOnClickListener { changeColor(it) }
        text_view_6.setOnClickListener { changeColor(it) }
        text_view_7.setOnClickListener { changeColor(it) }
        text_view_8.setOnClickListener { changeColor(it) }
        text_view_9.setOnClickListener { changeColor(it) }

    }


    private fun changeColor(view : View){

        val random : Random = Random
        val randomC = Color.argb(255,random.nextInt(256),
                random.nextInt(256),random.nextInt(256))

        val randomCC = Color.argb(255,random.nextInt(256),
                random.nextInt(256),random.nextInt(256))

        view.setBackgroundColor(randomC)//Button's BackGround

    }

}