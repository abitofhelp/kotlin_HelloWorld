////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2018 A Bit of Help, Inc. - All Rights Reserved, Worldwide.
// Use of this source code is governed by a MIT license that can be found in the LICENSE file.
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

// Package main is the entry point to the application.
package main

// Class HelloWorld1 displays its message using a static string.
class HelloWorld1 {
    fun say() {
        println("Hello from a class!")
    }
}

// Class HelloWorld2 displays its message using a constructor and property.
class HelloWorld2(private val msg: String) {
    fun say() {
        println(msg)
    }
}

// Class HelloWorld3 displays its message using a parameter to an object method.
class HelloWorld3 {
    fun say(msg: String) {
        println(msg)
    }
}

// Function main is the entrypoint for the application.
// It instantiates some classes that display hello using various techniques.
fun main(args: Array<String>) {
    println("Hello World!")

    HelloWorld1().say()
    HelloWorld2("Hello from a class method with a constructor!").say()
    HelloWorld3().say("Hello from a class method without a constructor!")
}
