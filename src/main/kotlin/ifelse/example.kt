package ifelse

fun main() {
    var money = 600
    val food = if (money > 500){
        money -= 500
        "Пицца"
    } else if (money > 200){
        money -= 200
        "Шаурма"
    } else {
        money -= 40
        "Доширак"
    }
    println("Вы можете себе позволить купить следующий продукт: $food, у вас осталось: $money рублей")
}