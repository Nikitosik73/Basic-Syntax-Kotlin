package loop

fun main() {
    // выводим список массива из своих элементов
//    val numbers = arrayOf(1, 2, 3 , 4, 5, 7)
//    for (i in numbers){
//        println(i)
//    }

//    // создаём массив от 0 до 100 вкючительно
//    val numbers = arrayOfNulls<Int?>(101)
//    // присваиваем значения
//    for (i in 0 until numbers.size){
//        numbers[i] = i
//    }
//    for (i in numbers){
//        println(i)
//    }

    // выведем массив в обратном порядке с шагом в 2
//    for (numbers in 100 downTo 0 step 2){
//        println(numbers)
//    }
    val numbers = arrayOfNulls<Int?>(101)
    for (i in numbers.indices){
        numbers[i] = i
    }
    // изменяем массив
    for ((index, i) in numbers.withIndex()){
        numbers[index] = i?.times(2)
    }
    for (number in numbers){
        println(number)
    }
}