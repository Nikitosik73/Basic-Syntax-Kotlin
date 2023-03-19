package loop

fun main() {
    // моё решение
//    val numbers = arrayOfNulls<Int?>(301)
//    for (i in numbers.indices){
//        numbers[i] = i
//    }
//    for (number in 600 downTo 300 step 5){
//        println(number)
//    }
    // решение сумина
    val numbers = arrayOfNulls<Int?>(301)
    for ((index, i) in (300..600).withIndex()){
        numbers[index] = i
    }
    for (i in numbers.size - 1 downTo 0 step 5){
        println(numbers[i])
    }
}