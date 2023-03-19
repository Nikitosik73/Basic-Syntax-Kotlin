package nullbletypes

private var name: String? = null
private var lastName: String? = "Paramonov"
private var city: String? = "Moscow"

fun main() {

//    val length = name!!.length
//    println(length)

//    val length = name?.length
//    println(length)

//    val length = name?.length?.toString()
//    println(length)

    // домашнее задание
    val lengthName = name?.length?:0
    val lengthLastName = lastName?.length?:0
    val lengthCity = city?.length?:0

    val result = lengthName + lengthLastName + lengthCity
    println(result)
}