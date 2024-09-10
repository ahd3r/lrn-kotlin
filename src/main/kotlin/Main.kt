package org.example

fun templateString(word: String) = "Hello $word!"

fun greeting(word: String = "Hi", name: String = "Bro", vararg extraWords:String): String {
    return if (extraWords.isNotEmpty()) {
        "$word $name ${extraWords.joinToString(",")}!"
    } else {
        "$word $name!"
    }
}

fun main(args: Array<String>): Unit {
    println(args.contentToString())

    templateString("world")

    var test: String? = "test"
    val name: String = "Kotlin"
    test = null
    println("Hello, $name!")
    test = "test2"
    println("Hello, $test!")

    for (i in 1..5) {
        when (i) {
            1 -> println("hi")
            2 -> println("hello")
            3 -> println("yo")
            4 -> println("saluto")
            5 -> println("bonjour")
            6 -> println("privet")
            else -> println("privit")
        }
    }

    val arrS: Array<String> = arrayOf("Java", "Groovy", "Scala", "Kotlin")
    try {
        println(arrS.get(1))
        println(arrS[1])
        println(arrS.get(10))
        println(arrS[10])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Caught ArrayOutOfIndex exception")
    }
    arrS.forEach{s -> println(s)}

    println(greeting())
    println(greeting("Hello"))
    println(greeting("Hello", "World"))
    println(greeting(name = "Andy"))
    println(greeting(name = "Andy", extraWords = arrayOf("a", "q")))

    val p: AdvancedPerson = AdvancedPerson()
    p.getFullName()
    println(p.nickName)
    p.nickName = "test"
    println(p.nickName)
    p.getFullName()
    println(AdvancedPerson.getClassName())
}
