/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User
 и возвращает средний возраст всех пользователей.

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

//data class Employee(val name: String, val age: Int)
fun main() {
	val programmist1 = Employee( "Kirill", 32)
	val programmist2 = Employee( "Ivan", 20)
	val manager1 = Employee("Olga", 50)
	val manager2 = Employee("Natasha", 40)
	val listOfEmployee = mutableListOf<Employee>(programmist1, programmist2, manager1, manager2)
	val midAge: List<Int> = mutableListOf(programmist1.age, programmist2.age, manager1.age, manager2.age)
	println(middleAgeCount(listOfEmployee))
	println(youngestPerson(listOfEmployee))
}

fun middleAgeCount(listOfEmployee: List<Employee>): Int
{
	var count = 0
	var age = 0
	for (person in listOfEmployee)
	{
		count++
		age += person.age
	}
	return age / count
}

