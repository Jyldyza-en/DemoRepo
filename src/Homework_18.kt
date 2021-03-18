

fun main(){

    val cat = Cat("Garfield",
            7,
            "exotic",
            "redhead",
            "lazy",
            18)
    println("Cat:")
    println(cat.name)
    println(cat.age)
    println(cat.breed)
    println(cat.color)
    println(cat.character)
    println(cat.weight)

    val food = Food("lasagna",
            "Italian Cuisine",
            "A dish made from thin sheets of dough with layers of various fillings.",
            "baking")
    println("Food:")
    println(food.name)
    println(food.category)
    println(food.description)
    println(food.cookingMethod)

    val paper = Paper()
    println("Paper:")
    println(paper.view)
    println(paper.size)
    println(paper.color)

    val boiler = Boiler("Ariston",
            85,
            "white")
    println("Boiler:")
    println(boiler.name)
    println(boiler.volumeInLiters)
    println(boiler.color)

    val battery = Battery("Duracell",
            "AA",
            "black with gold",
            true)
    println("Battery:")
    println(battery.name)
    println(battery.size)
    println(battery.color)
    println(battery.workingBattery)

    val liquid = Liquid("Water",
            0.5,
            "transparent")
    println("Liquid:")
    println(liquid.typeOfLiquid)
    println(liquid.amountInMl)
    println(liquid.color)

    val cup = Cup("grey",
            "middle",
            "ceramics",
            "coffee or tea")
    println("Cup:")
    println(cup.color)
    println(cup.size)
    println(cup.material)
    println(cup.createdFor)

    val box = Box("big",
            "craft",
            "black",
            "present",
            true)
    println("Box:")
    println(box.size)
    println(box.material)
    println(box.color)
    println(box.createdFor)
    println(box.boxLid)

    val student = Student("Jack",
            "Williams",
            22,
            "Harvard University",
            "painter",
            "baseball")

    println("Student:")
    println(student.name)
    println(student.surname)
    println(student.age)
    println(student.theNameOfTheInstitution)
    println(student.specialty)
    println(student.hobby)

    val companyEmployee = CompanyEmployee("Daniyar",
            "Murzakulov",
            34,
            12,
            "back office",
            "Leading Specialist",
            20000)
    println("Company employee:")
    println(companyEmployee.name)
    println(companyEmployee.surname)
    println(companyEmployee.age)
    println(companyEmployee.experience)
    println(companyEmployee.department)
    println(companyEmployee.position)
    println(companyEmployee.salary)

    val cat2 = Cat2()

    cat2.meetTheCat()
    cat2.changeTheCat()

}

class Cat(val name: String,
          val age: Int,
          val breed: String,
          val color: String,
          val character: String,
          val weight: Int)

class Food(val name: String,
           val category: String,
           val description: String,
           val cookingMethod: String)


class Paper{

    val view: String = "offset"
    val size: String = "A4"
    val color: String = "white"

}

class Boiler(val name: String,
             val volumeInLiters: Int,
             val color: String)


class Battery(val name: String,
              val size: String,
              val color: String,
              val workingBattery: Boolean)

class Liquid(val typeOfLiquid: String,
             val amountInMl: Double,
             val color: String)

class Cup(val color: String,
          val size: String,
          val material: String,
          val createdFor: String)

class Box(val size: String,
          val material: String,
          val color: String,
          val createdFor: String,
          val boxLid: Boolean)

class Student(val name: String,
              val surname: String,
              val age: Int,
              val theNameOfTheInstitution: String,
              val specialty: String,
              val hobby: String)

class CompanyEmployee(val name: String,
                      val surname: String,
                      val age: Int,
                      val experience: Int,
                      val department: String,
                      val position: String,
                      val salary: Int)

class Cat2{

    val name: String = "Murzik"
    val age: Int = 6
    private var satietyLevel: String = "well-fed"
    private var waterLevel: String = "doesn't want drink"

    fun meetTheCat(){
        println("The cat's name is $name, he is $age years old. The cat is $satietyLevel and $waterLevel .")
    }
    fun changeTheCat(){
        satietyLevel = "hungry"
        waterLevel = "thirsty"
        println("Oh... The cat is $satietyLevel and $waterLevel .")
    }
}
