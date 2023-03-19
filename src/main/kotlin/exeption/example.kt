package exeption

fun main() {
    println(sum("10", "10"))
}

fun sum(a: String, b: String): Int {
    // try and catch является выражением
//    return try {
//        val numberA = a.toInt()
//        val numberB = b.toInt()
//        return numberA + numberB
//    } catch (e: Exception) {
//        0
//    }
    val result = try {
      val numberA = a.toInt()
      val numberB = a.toInt()
      numberA + numberB
    } catch (e: Exception){
        0
    }
    return result
}