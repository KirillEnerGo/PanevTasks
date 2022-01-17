/*
Вывести для чисел от 1 до 5 их текстовое представление: 1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то вывести: «ошибка»
*/

fun main() {
	val digit = readLine()!!.toIntOrNull()
	var text: String
	when(digit)
	{
		1 -> text = "один"
		2 -> text = "два"
		3 -> text = "три"
		4 -> text = "четыре"
		5 -> text = "пять"
		else -> text = "ошибка"
	}
	println(text)
}