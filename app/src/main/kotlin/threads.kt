package org.example
import kotlin.concurrent.thread
fun main() {
    println("thread in kotlin")
    println(Thread.currentThread().name)

    //creating new thread
    thread{
        println("doing work")
        println("doing work")
        Thread.sleep(7000)
        println("other work")
        println("other work")
    }

}