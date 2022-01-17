/*
Для классов User и Car из задач по дата-классам написать функцию,
 которая принимает на вход список автомобилей
и пользователя и выдает список только тех автомобилей из исходного
 списка, которые доступны данному пользователю.

Дата-классы User и Car уже описаны в этом разделе и достуны здесь.

Проверьте работу написанной функции на примере каких-нибудь входных данных.
*/

// data class Car(val brand: String, val model: String, val cost: Double)

fun main()
{
	val bmw = Car("BMW", "X7", 3000.0)
	val audi = Car("Audi", "A8", 3_00.0)
	val toyota = Car("Toyota", "Sequoia", 5000.0)
	val lexus = Car("Lexus", "lx 400", 2000.0)
	val porshe = Car("Porshe", "Cayeen", 6000.0)

	val user = User("Kirill", 32, 5)

	val carList: List<Car> = mutableListOf(bmw, audi, toyota, lexus, porshe)
	println(validationUserAndSelectCarList(user, carList))
}

fun validationUserAndSelectCarList(user: User, carList: List<Car>): List<Car>
{
	var tempListCar = mutableListOf<Car>()
	val result = when
	{
		user.age >= 26 && user.experience >= 6 -> 0
		user.age >= 21 && user.experience >= 2 -> 1
		else -> 3
	}
	for (car in carList)
	{
		if (result == 0)
			return carList
		else if (result == 1)
		{
			var tempListCar = carList.toMutableList()
			tempListCar.removeAt(0)
			tempListCar.removeAt(0)
			return tempListCar
		}
	}
	return tempListCar
}