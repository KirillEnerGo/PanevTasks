/*
Дан класс, описывающий сотрудника:
data class Employee(val name: String, val age: Int)
Этот класс уже описан в отдельном файле в этом разделе и доступен здесь.

Написать функцию, которая принимает на вход список объектов класса User  и возвращает самого младшего из них

Проверить работу написанной функции на примере каких-нибудь входных данных.
*/

fun main() {
	val programmist1 = Employee( "Kirill", 32)
	val programmist2 = Employee( "Ivan", 20)
	val manager1 = Employee("Olga", 50)
	val manager2 = Employee("Natasha", 40)
	val listOfEmployee = mutableListOf<Employee>(programmist1, programmist2, manager1, manager2)
	println(youngestPerson(listOfEmployee))
}

fun youngestPerson(listOfEmployee: List<Employee>): Employee
{
	var youngestPerson: Employee = listOfEmployee[0]
	for (person in listOfEmployee)
	{
		if (youngestPerson.age > person.age)
			youngestPerson = person
	}
	return youngestPerson
}