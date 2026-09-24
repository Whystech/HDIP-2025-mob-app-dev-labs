package org.setu.types.ie.setu.types

fun main(){
    typeInference()
    usingUnderscores()
    explicitConversions(34)
    mutableVariables(25, 30)
    whenFunc(5, "My other number")
}

fun typeInference(){
    println ("\n==========================================================")
    println ("============  Using Type Inference in Kotlin =============")
    println ("==========================================================")

    val doubleNumber = 1200.45
    val floatNumber = 700.78f
    val longNumber = 98765432L
    val intNumber = 123456
    val shortNumber = 345
    val byteNumber = 127

    println("doubleNumber value is: " + doubleNumber + ", and the type is: " + doubleNumber.javaClass)
    println("floatNumber value is:  " + floatNumber + ", and the type is: " + floatNumber.javaClass)
    println("longNumber value is:   " + longNumber + ", and the type is: " + longNumber.javaClass)
    println("intNumber value is:    " + intNumber + ", and the type is: " + intNumber.javaClass)
    println("shortNumber value is:  " + shortNumber + ", and the type is: " + shortNumber.javaClass)
    println("byteNumber value is:   " + byteNumber + ", and the type is: " + byteNumber.javaClass)
}

fun usingUnderscores(){
    println ("\n==========================================================")
    println ("=========  Using underscores in numeric values ===========")
    println ("==========================================================")

    //underscores make number values more readable in code

    println("\nUsing underscores to make values more readable:")
    val oneMillion = 1_000_000
    val threeThousand = 3_000
    val creditCardNumber = 1234_4321_5678_8765

    println("\t" + oneMillion + " - the type is: " + oneMillion.javaClass)
    println("\t" + threeThousand + " - the type is: " + threeThousand.javaClass)
    println("\t" + creditCardNumber + " - the type is: " + creditCardNumber.javaClass)
    println()
}

fun explicitConversions(inputByte : Byte){
    println ("\n==========================================================")
    println ("=================  Explicit Conversions ==================")
    println ("==========================================================")

    val byteNum: Byte = inputByte       //static type check: OK
    val intNum: Int = byteNum.toInt()   //explicit conversion: OK
    val floatNum: Float = byteNum.toFloat()
    val doubleNum: Double = intNum.toDouble()

    println("byteNum: "   + byteNum)
    println("intNum: "    + intNum)
    println("floatNum: "  + floatNum)
    println("doubleNum: " + doubleNum)

    println()
}

fun mutableVariables (input: Int, updatedNumber: Int){
    println ("\n==========================================================")
    println ("===========  Working with Mutable Variables =============")
    println ("==========================================================")

    //mutable variables
    var number = input   //Int type is inferred

    number++;       //mathematical operations are allowed
    println("number: " + number)

    number = updatedNumber;       //Allowed to reassign a var too
    println("number: " + number)

    println()
}

fun whenFunc(x: Int, name: String) {
    var y = x
    var divisibleCount = 0
    val name1 = name
    for (i in 1..10){
        y += i
        println ("\t$name is currently $y")
        when (y % 5){
            0 -> { println("$name is divisible by 5")
                divisibleCount += 1 }
            }
        }
    if (divisibleCount == 0){
        println("$name was never divisible by 5")}
    else {
        println("$name was divisible by 5 \"$divisibleCount\" times")
    }
    }




//  Kept below for reference
fun notMain(){
    println("Hello World !")
    println("Working with Variables and Types\n")

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
    println("\nEnd of type-declared variables.\n")

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

    //Implicit conversion does not work

    val byteNum: Byte = 10
    //val intNum: Int = byteNum <<<< Will NOT work - cannot widen numbers

    //Explicit conversion - each number type supports explicit number conversions.
    val byteNum1: Byte = 10

    val intNum: Int = byteNum.toInt()
    println("\t" + byteNum + " - the type is: " + byteNum.javaClass)

    val floatNum: Float = byteNum.toFloat()
    println("\t" + floatNum + " - the type is: " + floatNum.javaClass)

    val doubleNum: Double = intNum.toDouble()
    println("\t" + doubleNum + " - the type is: " + doubleNum.javaClass)

    //Character types

    val aChar = 'a'			// inference
    val bChar: Char = 'b'   //explicit definition of

    println("\taChar: " + aChar + " - the type is: " + aChar.javaClass)
    println("\tbChar: " + bChar + " - the type is: " + bChar.javaClass)

    //Booleans

    val aFlag = true
    val bFlag: Boolean = false

    println("aFlag: " + aFlag + " - the type is: " + aFlag.javaClass)
    println("bFlag: " + bFlag + " - the type is: " + bFlag.javaClass)

    //Val vs var

    val bChar1: Char = 'b' //Explicitly defining the type and assigning the value
    //val bChar: Char  <<<< Will NOT work, just defining the type is not enough (null-safety reasons)

    val bChar2 : Char
    bChar2 = 'b' //this works but depending on scenario - such as reading from a user / input
    println("bCha2r: " + bChar2 + " - the type is: " + bChar2.javaClass)

    // bChar2 = 'B' <<<<< Will NOT work, can't reassing value

    //Mutable variable

    var number = 5
    number ++
    println("\tnumber ++ equals to $number")
    number = 3
    println("\tnumber reassigned to 3: $number")

}

