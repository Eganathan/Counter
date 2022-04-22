package com.varefree.counter
//Singlton Class
object CountView {
    private var count:Int = 0

    //Returns the string value of count
    fun getCount():String{
        return count.toString()
    }

    //Operate function
    fun operation( operator: Char):String{
        when(operator) {
            '+' -> ++count
            '-' -> --count
            else -> count
        }
    return count.toString()
    }

    fun reset()
    {
        count = 0
    }

}