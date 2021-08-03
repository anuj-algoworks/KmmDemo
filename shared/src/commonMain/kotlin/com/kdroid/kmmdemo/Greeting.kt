package com.kdroid.kmmdemo

import kotlinx.datetime.*

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform.reversed()}! \n"+
                "there are only ${daysUntilNewYear()} days left !"
    }
}
fun daysUntilNewYear():Int{
    val  today = Clock.System.todayAt(TimeZone.currentSystemDefault())
    val closetToNewYear  = LocalDate(today.year+1,1,1)
    return today.daysUntil(closetToNewYear)
}