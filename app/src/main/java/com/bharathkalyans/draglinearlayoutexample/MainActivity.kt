package com.bharathkalyans.draglinearlayoutexample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jmedeisis.draglinearlayout.DragLinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dragLinearLayout : DragLinearLayout = findViewById(R.id.container)

        for (i in 0 until dragLinearLayout.childCount) {
            val child: View = dragLinearLayout.getChildAt(i)
            dragLinearLayout.setViewDraggable(child, child) // the child is its own drag handle
        }
        /*for(int i = 0; i < dragLinearLayout.getChildCount(); i++){
            View child = dragLinearLayout.getChildAt(i);
            dragLinearLayout.setViewDraggable(child, child);
        }*/
    }
}