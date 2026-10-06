package org.setu.placemark.console.main

import mu.KotlinLogging
import org.setu.placemark.console.models.PlacemarkModel
import java.lang.reflect.Array

private val logger = KotlinLogging.logger {}

var placemark = PlacemarkModel()
var placemarks = ArrayList<PlacemarkModel>()

fun main() {
    logger.info { "Launching Placemark Console App" }
    println("Placemark Kotlin App Version 2.0")

    var input: Int

    do {
        input = menu()
        when (input) {
            1 -> addPlacemark()
            2 -> updatePlacemark()
            3 -> listPlacemarks()
            4 -> searchPlacemarks()
            -99 -> dummyData()
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
    println(" 4. Find Placemarks")
    println("-1. Exit")
    println()
    print("Enter your option : ")
    input = readln()
    option = if (input.toIntOrNull() != null && input.isNotEmpty())
        input.toInt()
    else
        -9

    return option
}

fun addPlacemark() {

    var aPlacemark = PlacemarkModel()
    println("Add Placemark")
    println()
    print("Enter a Title : ")
    aPlacemark.title = readln()
    print("Enter a Description : ")
    aPlacemark.description = readln()

    if (aPlacemark.title.isNotEmpty() && aPlacemark.description.isNotEmpty()) {
        aPlacemark.id = placemarks.size.toLong()
        placemarks.add(aPlacemark.copy())
        logger.info("Placemark Added : [ $aPlacemark ]")
    }
    else
        logger.info("Placemark Not Added")
    }


fun updatePlacemark() {
    println("Update Placemark")
    println()
    listPlacemarks()
    println("Input placemark id to be updated.")
    val searchId = getId()
    val aPlacemark = search(searchId)
    if (aPlacemark != null) {
        print("Enter a new Title for " + placemark.title + "  : ")
        val title = readln()
        print("Enter a new Description: " + placemark.description + "  : ")
        val description = readln()
            if (title.isNotEmpty() && description.isNotEmpty()) {
                println(
                    "You updated with title [ " + aPlacemark.title + " ] "  +
                            "and with description [ " + aPlacemark.description + " ]"
                )
            }
            else
                logger.info { "Placemark not updated, title or description are empty." }
                println()
    }
        else
            logger.info { "Invalid ID selected." }
}

fun listPlacemarks() {
    println("List All Placemarks")
    println()
    placemarks.forEach { println("$it") }
}

fun searchPlacemarks() {
    val id = getId()
    val placemark = search(id)
    if (placemark != null){
        logger.info { "Placemark found: $placemark" }
    }
    else
        logger.info { "Placemark not found" }
}

fun getId() : Long {
    var strId : String?
    var searchId : Long
    print("Enter Placemark ID to search: ")
    strId = readln()
    searchId = if (strId.toLongOrNull() != null && strId.isNotEmpty())
        strId.toLong()
    else
        -9
    return searchId
}

fun search (id: Long) : PlacemarkModel? {
    var foundPlacemark : PlacemarkModel? = placemarks.find {p -> p.id ==id}
        return foundPlacemark
}

fun dummyData() {
    placemarks.add(PlacemarkModel(1, "New York New York", "So Good They Named It Twice"))
    placemarks.add(PlacemarkModel(2, "Ring of Kerry", "Some place in the Kingdom"))
    placemarks.add(PlacemarkModel(3, "Waterford City", "You get great Blaas Here!!"))
}


fun listPlacemarksExtra() {
    println("Listing placemarks.\n")
    for (placemark in placemarks) {
        println("")
        println(placemark.title)
        println(placemark.description)
        println("======")
        println("Press enter to return to menu")
        var input = readln()
    }
}




