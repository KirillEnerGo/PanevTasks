/*
Дана следующая структура классов.
Компания: data class Company(val name: String, val departments: List<Department>)
Отдел: data class Department(val name: String, val employees: List<Employee>)
Сотрудник: data class Employee(val name: String, val age: Int)
Эти классы уже описаны в отдельных файлах в этом разделе и доступны здесь.

Написать функции для подсчета общего количества человек, работающих в заданной
компании и их среднего возраста:
fun totalNumberOfEmployees(company: Company): Int
fun averageAgeOfEmployees(company: Company): Int

Для этой задачи есть видео с разбором.
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
	val listOfDepartments = listOf<Department>(programmistDepartment, managersDepartment)

	val company = Company("Energy", listOfDepartments)

	println(middleAgeCompany(company))

}
fun middleAgeCompany(company: Company): Int
{
	var middleAge = 0
	for(employee in company.departments)
	{
		middleAge += depar
	}
	return middleAge / department.employees.size
}