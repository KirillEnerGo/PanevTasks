/*
Даны классы
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функцию, которая на вход принимает объект класса Department
 и возвращает средний возраст сотрудников этого отдела
Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
	val programmist1 = Employee( "Kirill", 32)
	val programmist2 = Employee( "Ivan", 20)
	val manager1 = Employee("Olga", 50)
	val manager2 = Employee("Natasha", 40)

	val listOfProgrammers = listOf<Employee>(programmist1, programmist2)
	val listOfManagers = listOf<Employee>(manager1, manager2)

	val programmistDepartment = Department("department of developing", listOfProgrammers)
	val managersDepartment = Department("department of managers", listOfManagers)

	println(middleAgeDepartment(programmistDepartment))
	println(middleAgeDepartment(managersDepartment))
}
fun middleAgeDepartment(department: Department): Int
{
	var middleAge = 0
	for(employee in department.employees)
	{
		middleAge += employee.age
	}
	return middleAge / department.employees.size
}
