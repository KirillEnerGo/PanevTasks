import java.lang.Exception

/*
Переделайте функцию findEmployeeBySalary  из задачи по null safety таким образом,
 чтобы ее возвращаемый тип
был SomeEmployee,а не SomeEmployee?.
А в случае если подходящий сотрудник не найден, выбрасывайте исключительную ситуацию.
Вызовите эту функцию из main, обернув ее в try catch, обработав эту исключительную ситуацию в функции main.

p.s. здесь речь не идет о том, что такой вариант в данном случае предпочтительнее, чем использование null.
Рассматривайте это просто как практику работы с Exceptions

Для этой задачи есть видео с разбором.
*/

fun main() {

	val user1 = SomeEmployee("Kirill", 500000)
	val user2 = SomeEmployee("Olga", 400000)
	val user3 = SomeEmployee("Ivan", 300000)
	val user4 = SomeEmployee("Tolya", 200000)
	val user5 = SomeEmployee("Max", 100000)

	val listOfUsers = listOf<SomeEmployee>(user1, user2, user3, user4, user5)


//    println("${findEmployeeBySalary(listOfUsers, 500000)?.name}")
//    println("${findEmployeeBySalary(listOfUsers, 400000)?.name}")

//	findEmployeeBySalary(listOfUsers, 50000).name
	try {
		println("${findEmployeeBySalary(listOfUsers, 50000).name}")
	}catch (e: Exception){
		println(e.message)
	}
}

class SomeEmployee(
	val name: String,
	val salary: Int
) {

	fun callToClient(clientName: String) {
		println("Сотрудник ${name}: звоню клиенту $clientName")
	}
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee
{

	for (user in employees)
	{
		if (user.salary == age)
			return user
	}
/*	try {
		for (user in employees)
		{
			if (user.salary == age)
				return user
		}
	} catch (e: Exception){
		println("Такая зарплата не найдена")
	}*/
	throw Exception("Такая зарплата$age не найдена")
}