package com.varefree.counter

object CountView {
    private var count:Int = 0

    fun getCount():String{
        return count.toString()
    }

    fun addCount()
    {count++}

    fun deduct()
    {
        if(count >= 1)
        count--
    }

    fun reset()
    {
        count = 0
    }

}