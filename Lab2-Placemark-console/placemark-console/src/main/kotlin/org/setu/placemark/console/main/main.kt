package org.setu.placemark.console.main

import mu.KotlinLogging
import java.lang.reflect.Array

private val logger = KotlinLogging.logger {}
private var placemarks = emptyArray<String>()



fun main() {
    println("Placemark Kotlin App Version 1.0")
    logger.info { "This is a text from te logger" }


    var input: Int

    do {
        input = menu()
        when (input) {
            1 -> addPlacemark()
            2 -> updatePLacemark()
            3 -> listPlacemarks()
            -1 -> println("Exiting App")
            else -> println("Invalid Option")
        }
        println()
    } while (input != -1)
    logger.info { "Shutting Down Placemark Console App" }
}


fun menu (): Int {
    var option: Int;
    var input: String? = null

    println("Main Menu")
    println(" 1. Add Placemark")
    println(" 2. Update Placemark")
    println(" 3. List Placemarks")
    println("-1. Exit")
    println()
    print("Enter an integer : ")
    input = readln()
    option = if (input.toIntOrNull() != null && input.isNotEmpty())
        input.toInt()
    else
        -9

    return option
}

fun addPlacemark() {
    println("Type your placemark now.")
    var name = readln()
    placemarks += name
}

fun updatePLacemark() {
    println("Updating placemark now.")
}

fun listPlacemarks() {
    println("Listing placemarks.\n")
    for (placemark in placemarks) {
        println(placemark + "\n")
    }
}




