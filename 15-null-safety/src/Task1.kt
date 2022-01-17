/*
1.	Есть класс:
    class SomeEmployee(
            val name: String,
            val salary: Int
    ) {

        fun callToClient(clientName: String) {
            println("Сотрудник ${name}: звоню клиенту $clientName")
        }
    }

Написать функцию
fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
которая ищет в списке сотрудников сотрудника с заданной зарплатой.
Сделайте так, чтобы функция возвращала null в случае если такого сотрудника в списке нет
Создать произвольный список сотрудников. Используя эту функцию найти в списке сотрудника
 с определенной зарплатой.
Вызвать у него функцию callToClient, используя безопасный вызов (?)
*/

fun main() {

    val user1 = SomeEmployee("Kirill", 500000)
    val user2 = SomeEmployee("Olga", 400000)
    val user3 = SomeEmployee("Ivan", 300000)
    val user4 = SomeEmployee("Tolya", 200000)
    val user5 = SomeEmployee("Max", 100000)

    val listOfUsers = listOf<SomeEmployee>(user1, user2, user3, user4, user5)
    println("${findEmployeeBySalary(listOfUsers, 500000)?.name}")
    println("${findEmployeeBySalary(listOfUsers, 400000)?.name}")
}

class SomeEmployee(
        val name: String,
        val salary: Int
) {

    fun callToClient(clientName: String) {
        println("Сотрудник ${name}: звоню клиенту $clientName")
    }
}

fun findEmployeeBySalary(employees: List<SomeEmployee>, age: Int): SomeEmployee?
{
    for (user in employees)
    {
        if (user.salary == age)
            return user
    }

    return null
}