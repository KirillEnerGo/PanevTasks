/* Вывести на экран большее из двух целых чисел. */

fun main(){
    val a: Int? = readLine()?.toIntOrNull()
    val b: Int? = readLine()?.toIntOrNull()

    var max = 0
    if (a != null && b != null)
        max = if (a!! > b!!) a else b
    print("maxDigit = $max")
}
