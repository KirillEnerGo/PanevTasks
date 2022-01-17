/*
Те же требования каршеренга, что и в задаче 5.
Общие требования:
•	Возраст не меньше 21 года.
•	Водительский стаж категории «В» от двух лет.
Дополнительные требования для доступа к автомобилям Audi, BMW:
•	Возраст не меньше 26 лет.
•	Водительский стаж категории «В» от шести лет.

На вход подаются: марка авто(String), возраст и стаж пользователя.
Определить доступно ли ему это авто или нет.
*/

fun main() {
	val marka = readLine().toString()
	val age = readLine()!!.toIntOrNull()
	val driveExperience = readLine()!!.toIntOrNull()
	val whatAutoMark = when (marka) {
		"Audi" -> 1
		"BMW" -> 2
		else -> 0
	}



	if (age!! > 21 && driveExperience!! > 2) {
		println("Вы можете пользоваться каршерингом")
		if (age > 26 && driveExperience > 6)
		{
			if (whatAutoMark == 1)
				println("Вам доступны авто Audi")
			else if (whatAutoMark == 2)
				println("Вам доступны авто BMW")
			else
				println("Вам доступны авто Audi и BMW")
		}
	} else
		println("Вам менее 21 года или ваш опыт < 2 лет")

}