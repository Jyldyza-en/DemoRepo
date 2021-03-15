
fun main(){
    /* val person = Person()    вариант 1

    println(person.name1)
    println(person.surname)
    println(person.age1)*/

    /*val person = Person("Asan", "Uson", 24) Вариант 2

    println(person.name1)
    println(person.surname)
    println(person.age1)*/

    val person = Person("Asan", "Uson", 24, "KG")

    println(person.name1)
    println(person.surname)
    println(person.age1)
    println(person.address)

    person.introduceYourSelf()

    val employee = Person.Employee("Elon", "Musk", 50, "USA", 25)

    println(employee.name1)
    println(employee.surname)
    println(employee.age1)
    println(employee.address)
    println(employee.experience)

    employee.introduceYourSelf()
}


/*class Person{
    val name1: String = "John"        !!!ВАРИАНТ 1
    val surname: String = "Doe"
    val age1: Int = 27

}*/

/*class Person(name1: String, surname: String, age1: Int){

    var name1: String = "John"      Вариант 2
    var surname: String = "Doe"
    var age1: Int = 27

    init {
        this.name1 = name1
        this.surname = surname   //конструктор, изменяет значение перем-х
        this.age1 = age1         //при введении значений аргументов с меин
    }

}*/
open class Person(val name1: String, val surname: String, val age1: Int){ //главный конструктор

    var address: String? = null
    constructor(name1: String, surname: String, age1: Int, address: String): this(name1, surname, age1){ //Второстепенный конструктор

        this.address = address
    }
    open fun  introduceYourSelf(){   //поведение
        println("My name is $name1, I love programming")
    }

   //наследование
class Employee(name1: String, surname: String, age1: Int, address: String, val experience: Int): Person(name1, surname, age1, address){
       override fun introduceYourSelf() {
           println("My name is $name1 $surname, I have $experience years of experience")
       }
}


}
