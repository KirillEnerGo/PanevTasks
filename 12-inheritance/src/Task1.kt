/*
Для созданных в предыдущих задачах классов Rectangle и Round
(нужно сюда скопировать ваш код этих классов)
пропишите суперкласс Figure, в котором будет поле цвет типа String,
 которое должно инициализироваться через конструктор
и два поля x и y типа Int, которые будут задавать положение фигуры
 в пространстве относитльено начала координат
и инициализироваться в теле класса начальными значениями ноль.

Пропишите в этом классе функции
moveLeft(step: Int), moveRight(step: Int), moveDown(step: Int), moveUp(step: Int),
которые будут сдвигать фигуру, то есть менять ее координаты x и y

Сделайте Rectangle и Round наследниками класса Figure

Для этой задачи есть видео с разбором.
*/

fun main()
{
	var rect = Rectangle("Blue", 10, 10)
	var round = Round("Blue", 50)
	round.x  = 10
	rect.y = -30
	rect.moveRight(10)
}

open class Figure(
	var color: String
)
{
	var x: Int = 0
	var y: Int = 0

	fun moveLeft(step: Int){
		x -= step
	}

	fun moveRight(step: Int){
		x += step
	}

	fun moveDown(step: Int){
		y -= step
	}

	fun moveUp(step: Int){
		y += step
	}
}

class Rectangle(
	color: String,
	private var width: Int,
	private var height: Int): Figure(color)
{
	fun squareRec(): Int = this.width * this.height

	fun perimeter(): Int = 2 * (this.height + this.width)

	fun isSquareRectangle(): Boolean = this.width == this.height
}

class Round(
	color: String,
	var radius: Int
): Figure(color)
{
	fun squareRound(): Double = Math.PI * radius * radius

	fun lengthOfRound(): Double = 2 * Math.PI * radius
}