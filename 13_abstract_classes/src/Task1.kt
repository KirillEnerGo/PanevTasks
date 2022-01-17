import kotlin.math.sqrt

/*
	Сделать класс Figure, из предыдущего урока абстрактным, перенести объявление функции area и length в него,
	оставив реализацию полиморфной для классов Rectangle и Round
	Для этого предварительно скопируйте сюда код классов, который вы написали в предыдущей задаче

	Для этой задачи есть видео с разбором.
	*/

fun main() {
	var triangle = Triangle("Green", 5.0, 3.0, 4.0)
	println(triangle.area())
}

	abstract class Figure(
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

		abstract fun area(): Double
		abstract fun length(): Double
	}

	class Rectangle(
		color: String,
		private var width: Int,
		private var height: Int): Figure(color)
	{
		override fun area(): Double = width * height.toDouble()

		override fun length(): Double = 2 * (height + width.toDouble())

		fun isSquareRectangle(): Boolean = this.width == this.height
	}

	class Round(
		color: String,
		var radius: Int
	): Figure(color)
	{
		override fun area(): Double = Math.PI * radius * radius

		override fun length(): Double = 2 * Math.PI * radius
	}

	class Triangle(
		color: String,
		var a: Double,
		var b: Double,
		var c: Double,
	) :Figure(color)
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






























