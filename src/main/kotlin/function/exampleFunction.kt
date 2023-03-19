package function

fun main() {
//    println(max(8, 9))
//    println(source("Niki"))
    println(sum(5, 6, 7, 7))
}

//fun max(a: Int, b: Int): Int{
//    if (a > b){
//        return a
//    } else {
//        return b
//    }
//}
//fun max(a: Int, b: Int): Int{
//    return if (a > b){
//        a
//    } else {
//        b
//    }
//}
//fun max(a: Int, b: Int): Int = if (a > b) a else b
fun source(source1: String): String = source1.substring(0, Math.min(5, source1.length))

fun sum(vararg numbers: Int): Int{
    var result = 0
    for (number in numbers){
        result += number
    }
    return result
}