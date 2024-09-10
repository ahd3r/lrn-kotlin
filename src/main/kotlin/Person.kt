package org.example

interface PersonI {
    val firstName: String
    val secondName: String
    val nickName: String?
    fun getFullName() {
        println("$firstName ($nickName) $secondName with age")
    }
}

open class Person (override val firstName: String = "Daryl", override val secondName: String = "Dixon"): PersonI {
    private var age = 30
    override var nickName: String? = "Norman Reedus"
        set(value) {
            field = value
            println("Trying to update nickname")
        }
        get() {
            println("Trying to read nickname")
            return field
        }

    override fun getFullName() {
        println("$firstName ($nickName) $secondName with age - $age")
    }
}

class AdvancedPerson(private val sex: String = "Male"): Person() {
    private var age = 30

    override fun getFullName() {
        println("$sex. $firstName ($nickName) $secondName with age - $age")
    }

    companion object {
        fun getClassName() = "AdvancedPerson"
    }
}
