import kotlin.math.sqrt

/*
Создайте коллекцию перемещаемых объектов
 (которые реализуют интерфейс Movable из предыдущей задачи),
среди которых будут разные геометрические фигуры и животные.
Переместить все элементы коллекции вправо на 10 шагов

Для этой задачи есть видео с разбором.
*/

fun main() {
	var zebra = Animal3("zebra")
	var lion = Animal3("lion")

	var triangle1 = Triangle3("Green","triangle1", 5.0, 3.0, 4.0)
	var triangle2 = Triangle3("Green", "triangle2", 30.0, 40.0, 20.0)

	var listAn = listOf<MovableAn>(zebra, lion, triangle1, triangle2)
	for(item in listAn)
		item.moveAll(10, 10)

}

interface MovableAn
{
	fun moveAll(stepX: Int, stepY: Int)
	fun moveLeft(step: Int)
	fun moveRight(step: Int)
	fun moveDown(step: Int)
	fun moveUp(step: Int)
}

class Animal3(var name: String): MovableAn
{
	var x: Int = 0
	var y: Int = 0
	override fun moveLeft(step: Int){
		x -= step
		println("moveLeft")
	}

	override fun moveRight(step: Int){
		x += step
		println("moveRight")
	}

	override fun moveDown(step: Int){
		y -= step
		println("moveDown")
	}

	override fun moveUp(step: Int){
		y += step
		println("moveUp")
	}

	fun voice(voice: String)
	{
		println("$name can voice: ..... $voice")
	}

	override fun moveAll(stepX: Int, stepY: Int) {
		x = x + stepX
		y = y + stepY
		println("$name change coordinates x = $x y = $y")
	}

	fun whatPosition()
	{
		println("$name  this animal at position: ")
		println("x = $x")
		println("y = $y")
	}
}

abstract class Figure3(
	var color: String,
	var name: String
):MovableAn
{
	var x: Int = 0
	var y: Int = 0

	override fun moveLeft(step: Int){
		x -= step
	}

	override fun moveRight(step: Int){
		x += step
	}

	override fun moveDown(step: Int){
		y -= step
	}

	override fun moveUp(step: Int){
		y += step
	}
	override fun moveAll(stepX: Int, stepY: Int) {
		x = x + stepX
		y = y + stepY
		println("$name change coordinates x = $x y = $y")
	}

	abstract fun area(): Double
	abstract fun length(): Double
}

class Triangle3(
	color: String,
	name: String,
	var a: Double,
	var b: Double,
	var c: Double,
):Figure3(color, name)
{
	override fun area(): Double
	{
		val p = (a + b + c) / 2
		return sqrt(p*(p-a)*(p-b)*(p-c))
	}

	override fun length(): Double {
		return (a + b + c.toDouble())
	}


}