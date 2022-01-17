/*
Создайте класс Animal с полями name: String, x: Int, y: Int,
 который будет реализовывать интерфейс Movable
из предыдущей задачи (любой вариант реализации на ваш выбор)

Для этой задачи есть видео с разбором.
*/

fun main() {
	var zebra = Animal("zebra", 10, 10)
	zebra.moveLeftUp(50, 100)
	zebra.whatPosition()
	zebra.voice("prrrr tcc")
}

interface MovableAnimal
{
	fun moveLeftUp(stepX: Int, stepY: Int)
	fun moveRightDown(stepX: Int, stepY: Int)
}

class Animal(
	var name: String,
	var x: Int = 0,
	var y: Int = 0
): MovableAnimal
{

	fun voice(voice: String)
	{
		println("$name can voice: ..... $voice")
	}

	override fun moveLeftUp(stepX: Int, stepY: Int) {
		x = x - stepX
		y = y + stepY
	}

	override fun moveRightDown(stepX: Int, stepY: Int) {
		x = x + stepX
		y = y - stepY
	}

	fun whatPosition()
	{
		println("$name  this animal at position: ")
		println("x = $x")
		println("y = $y")
	}
}
