/*
Опишите дата классы для хранения информации из задания 5 по функциям.
Для пользователя (User) должно храниться имя, возраст, стаж. Для автомобиля (Car): бренд, цена аренды

Переделайте задачи 5 и 6 из раздела функции на работу с этими дата-классами.
Т.е. функции должны принимать не возраст, стаж и бренд авто, а объекты классов User и Car
(функции пишите в этом файле заново)

Поля «имя» в классе User и «цена аренды» в классе Car никак не будут использоваться в тех функциях, которые вы напишите.
Это нормально. Не обязательно вся информация всегда нужна.

Проверьте работу написанных функций на примере каких-нибудь входных данных.
*/

fun main() {
	val user1 = User("Kirill", 32, 12)
	val user2 = User("Olga", 42, 20)
	val user3 = User("Alexey", 20, 3)

	val bmw = Car("BMW", 10)
	val audi = Car("Audi", 12)
	val mersedess = Car("Mersedess", 15)

	println("Hi ${user1.name} ${carsheringInitialisation(user1, bmw)} result validation is ${carsheringValidation(user1, bmw)}")
	println("${carsheringInitialisation(user2, audi)} result validation is ${carsheringValidation(user2, audi)}")
	println("${carsheringInitialisation(user3, mersedess)} result validation is ${carsheringValidation(user3, mersedess)}")
}

fun carsheringInitialisation(user: User, car: Car): String
{
	val result = when{
		user.age >= 26 && user.exp >= 6 -> "Вам доступны все авто"
		user.age >= 21 && user.exp >= 2 && (car.brand != "BMW" || car.brand != "Audi") -> "Вперед ! (кроме BMW / Audi)"
		else -> "maybe soon later ?"
	}
	return result
}

fun carsheringValidation(user: User, car: Car): Boolean
{
	val result = when{
		user.age >= 26 && user.exp >= 6 -> true
		user.age >= 21 && user.exp >= 2 && (car.brand != "BMW" || car.brand != "Audi") -> true
		else -> false
	}
	return result
}

data class User(val name: String, val age: Int, val exp: Int)
data class Car(val brand: String, val priceRent: Int)