package function

fun main() {
    val numbers = arrayOf(-1, -3, - 4, 0, 2, 1, - 7)
    val result = sort(-1, -3, - 4, 0, 2, 1, - 7)
    for (res in result){
        println(res)
    }
}

fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size){
        for (j in numbers.size - 1 downTo i){
            if (numbers[j] < numbers[j - 1]){
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

fun sort(numbers: Array<Int>): List<Int> = sort(numbers.toMutableList())

fun sort(vararg numbers: Int): List<Int> = sort(numbers.toMutableList())