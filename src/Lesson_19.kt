

fun main(){

    val person1 = Employee("Asan", "Uson", 27, 2)
    val person2 = Employee("Asan", "Uson", 27, 2)

    val person3 = person1.copy(surname = "Usonov")//копируем значения персон1 в персон3
                          //функция copy() работает только при data class

    //эти функции по умолчанию показывают:
    println(person1.toString())  //показывает адрес где он находится
    //println(person1.hashCode())
    println("person1 hash: ${person1.hashCode()}")
    println("person2 hash: ${person2.hashCode()}")
    println(person1 == person2)//сравниет по hashcode
    println(person1 == person3)
    println("person3: $person3")



}

//нужно добавить data перед классом чтобы функции показывали результат нам нужный

data class Employee(val name: String,
               val surname: String,
               val age: Int,
               val experience: Int){
    /* если бы не было data class, то мы в ручную делали бы так:

    override fun toString(): String {
        return "$name, $surname, $age, $experience"
    }

    override fun equals(other: Any?): Boolean {
        return this.name == (other as Employee).name
    }  */

}
