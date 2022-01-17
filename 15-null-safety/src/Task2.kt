/*
Есть классы:
class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)

Напишите функцию fun employeeCity(employee: Employee): String, которая возвращает название города,
в которой располагается организация, в которой работает данный человек.
В случае если он нигде не работает (в company лежит null), функция должна выводить: «Неизвестен»
Используйте функции безопасного вызова и оператор элвис

Для этой задачи есть видео с разбором.
*/

fun main() {
	var vavilova = Address("Street of friendly", "Moscow")
	var company = Company("Energy", vavilova)
	var user = Employee("Max", company)

	println("city = ${employeeCity(user)}")
}

fun employeeCity(employee: Employee): String
{

/*
	if (employee.company != null)
		if (employee.company.address != null)
			return employee.company.address.city
	return ("Nothing")
*/
	return employee.company?.address?.city ?: "Nothing"
}

class Address(val address: String, val city: String)
class Company(val name: String, val address: Address?)
class Employee(val name: String, val company: Company?)