/*
Напишите класс прямоугольника (Rectangle) с полями width и height (ширина и высота),
 инициализирующимися через конструктор.
Добавьте в него функции, которые будут считать площадь (width*height)
 и периметр прямоугольника (2*(width+height))
Добавьте функцию, которая будет отвечать на вопрос является ли этот
прямоугольник квадратом (равны ли его стороны)
Создайте объект класса Rectangle и проверьте работоспособность написанных функций

Для этой задачи есть видео с разбором.
*/

fun main() {

	var rectagle1 = Rectangle(20, 18)

	println(rectagle1.squareRec())
	println(rectagle1.perimeter())
	println(rectagle1.isSquareRectangle())
}

class Rectangle(
	var width: Int,
	var height: Int
	)
{
	fun squareRec(): Int = this.width * this.height

	fun perimeter(): Int = 2 * (this.height + this.width)

	fun isSquareRectangle(): Boolean = this.width == this.height

}



