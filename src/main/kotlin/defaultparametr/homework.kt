package defaultparametr

fun main() {
    println(volume(10, 5, 5))
}

fun volume(length: Int, width: Int = length, height: Int = length) = length * width * height