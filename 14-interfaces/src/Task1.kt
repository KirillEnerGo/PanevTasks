import kotlin.math.sqrt

/*
Создайте интерфейс Movable (перемещаемый),
 в котором будут описаны функции moveLeft(step: Int), moveRight(step: Int),
moveDown(step: Int), moveUp(step: Int).

Сделайте так, чтобы класс Figure из предыдущего задания реализовывал
 интерфейс Movable (скопируйте сюда код написанного
вами класса Figure)

Для этой задачи есть видео с разбором.
*/

fun main() {

}
interface Movable{
	fun moveLeft()
	fun moveRight()
	fun moveDown()
	fun moveUp()
}

abstract class Figure(
	var color: String
): Movable
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

	abstract fun area(): Double
	abstract fun length(): Double
}

