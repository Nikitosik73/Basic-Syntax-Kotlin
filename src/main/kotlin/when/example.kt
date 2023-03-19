package `when`

fun main() {
//    val mouth = "Ноябрь"
//    val season: String
//    when (mouth){
//        "Декабрь", "Январь", "Февраль" -> {
//            season = "Зима"
//        }
//        "Март", "Апрель", "Май" -> {
//            season = "Весна"
//        }
//        "Июнь", "Июль", "Август" -> {
//            season = "Лето"
//        }
//        "Сентябрь", "Октябрь", "Ноябрь" -> {
//            season = "Осень"
//        }
//        else -> {
//            season = "Не найдено!"
//        }
//    }
//    println(season)

//    val tempWater = 120
//    val stateWater = if (tempWater > 100){
//        "Газообразная"
//    } else if (tempWater > 0 && tempWater < 100) {
//        "Жидкая"
//    } else {
//        "Твёрдая"
//    }
//    println(stateWater)
//    val stateWater = when {
//        tempWater > 100 -> "Газообразная"
//        tempWater in 0..100 -> "Жидкая"
//        else -> "Твёрдая"
//    }
//    println(stateWater)

    // Домашння работа
    val time = 21
    val weatherIsGood = true
    val result = when {
        time in 8..20 && weatherIsGood -> {
            "Гулять"
        }

        time in 8..20 && !weatherIsGood -> {
            "Читать книгу"
        }

        else -> {
            "Спать"
        }
    }
    println(result)
}