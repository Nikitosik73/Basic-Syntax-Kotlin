package defaultparametr

fun main() {
    userInfo()
}

fun userInfo(lastName: String = "", name: String = "", patronymic: String = ""){
    if (lastName.isNotEmpty()) {
        println("Фамилия: $lastName")
    }
    if (name.isNotEmpty()) {
        println("Имя: $name")
    }
    if (patronymic.isNotEmpty()){
        println("Отчество: $patronymic")
    }
}
