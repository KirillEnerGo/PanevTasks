/*
Напишите класс круга (Round) с полем radius (радиус), инициализирующимся через конструктор.
Добавьте в него функции, которые будут считать площадь (Math.PI* radius * radius) и длину окружности (2*Math.PI*radius)
Создайте объект класса Round и проверьте работоспособность написанных функций
*/

fun main() {
	var round = Round(50)

	println(round.squareRound())
	println(round.lengthOfRound())
}

class Round(
	var radius: Int
)
{
	fun squareRound(): Double = Math.PI * radius * radius

	fun lengthOfRound(): Double = 2 * Math.PI * radius
}