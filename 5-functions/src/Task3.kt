/*
Написать функцию, которая возвращает текстовое представление для целых чисел от 1 до 5:
1 – «один», 2 – «два», 3 – «три», 4 – «четыре», 5 – «пять»
Если на вход приходит любое другое число, то возвращать: «ошибка»

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
	println(returnTextOfDigit(3))
}

fun returnTextOfDigit(number: Int): String
{
	val res = when(number){
		1 -> "один"
		2 -> "два"
		3 -> "три"
		4 -> "четыре"
		5 -> "пять"
		else -> "ошибка"
	}
	return res
}