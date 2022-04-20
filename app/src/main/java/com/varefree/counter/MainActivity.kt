package com.varefree.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil

class MainActivity : AppCompatActivity() {

    private lateinit var counterView: TextView
    private lateinit var addBtn:Button
    private lateinit var resetBtn :Button
    private lateinit var reduceBtn :Button
    private val count:CountView = CountView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Counter Text View
        counterView = findViewById(R.id.counterTextView)
        counterView.setText(CountView.getCount())

        //Buttons
        addBtn = findViewById(R.id.addBtn)
        reduceBtn = findViewById(R.id.reduceBtn)
        resetBtn = findViewById(R.id.resetBtn)

        //adding activity to buttons
        //ADD EVENT
        addBtn.setOnClickListener {
            count.addCount();
            setText()
        }

        //REDUCE EVENT
        reduceBtn.setOnClickListener {
            count.deduct()
            setText()
        }

        //REDUCE EVENT
        resetBtn.setOnClickListener {
            count.reset()
            setText()
        }

    }


    fun setText()
    {
        counterView.setText(CountView.getCount())
    }


}