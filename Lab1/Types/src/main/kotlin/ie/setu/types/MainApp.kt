package org.setu.types.ie.setu.types

fun main(){
    println("Hello World !")
    println("Working with Variables and Types")

    val doubleNumber: Double = 1200.45
    val floatNumber: Float = 700.78f
    val longNumber: Long = 987654321
    val intNumber: Int = 345
    val shortNumber: Short = 345
    val byteNumber: Byte  = 127


    println("doubleNumber value is: " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber value is:  " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber value is:   " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber value is:    " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber value is:  " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber value is:   " + byteNumber + ", and the type is: " + byteNumber.javaClass)
    println("End of type-declared variables.")

    //Without type declaration

    val doubleNumber1 = 1200.45
    val floatNumber1 = 700.78f
    val longNumber1 = 98765432L
    val intNumber1 = 123456
    val shortNumber1 = 345
    val byteNumber1 = 127

    println("doubleNumber value is: " + doubleNumber1 + ", and the type is: " + doubleNumber1.javaClass)
    println("floatNumber value is:  " + floatNumber1 + ", and the type is: " + floatNumber1.javaClass)
    println("longNumber value is:   " + longNumber1 + ", and the type is: " + longNumber1.javaClass)
    println("intNumber value is:    " + intNumber1 + ", and the type is: " + intNumber1.javaClass)
    println("shortNumber value is:  " + shortNumber1 + ", and the type is: " + shortNumber1.javaClass)
    println("byteNumber value is:   " + byteNumber1 + ", and the type is: " + byteNumber1.javaClass)

    //Underscore number notation

    println("\nUsing underscores to make values more readable:")
    val oneMillion = 1_000_000
    val threeThousand = 3_000
    val creditCardNumber = 1234_4321_5678_8765

    println("\t" + oneMillion + " - the type is: " + oneMillion.javaClass)
    println("\t" + threeThousand + " - the type is: " + threeThousand.javaClass)
    println("\t" + creditCardNumber + " - the type is: " + creditCardNumber.javaClass)

 }

