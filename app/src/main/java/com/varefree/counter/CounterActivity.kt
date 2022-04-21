package com.varefree.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class CounterActivity : AppCompatActivity() {
    private lateinit var counterView: TextView
    private lateinit var addBtn: Button
    private lateinit var resetBtn : Button
    private lateinit var reduceBtn : Button
    private val count:CountView = CountView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter)
        supportActionBar?.hide()


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

            //Sending a toast if the value is already 0
            if( Integer.parseInt(CountView.getCount()) == 0)
            {
                Toast.makeText(this, "The Value is already 0!",Toast.LENGTH_SHORT).show()
            }else {
                // else deducting the value
                count.deduct()
                setText()
            }
        }

        //RESET EVENT
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