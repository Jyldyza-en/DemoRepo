

fun main(){

    val cat = Cat("leopol'd",
            10,
            "Siamese",
            "grey",
            "clever",
            5)
    val cat1 = Cat("Matroskin",
            9,
            "bengal",
            "silver with patterns",
            "friendly",
            7)

    println(cat.toString())
    println(cat1.toString())
    println("cat hash: ${cat.hashCode()}")
    println("cat1 hash: ${cat1.hashCode()}")
    println(cat == cat1)

    val food = Food("lasagna",
            "Italian Cuisine",
            "A dish made from thin sheets of dough with layers of various fillings.",
            "baking")
    val food1 = Food("lasagna",
            "Italian Cuisine",
            "A dish made from thin sheets of dough with layers of various fillings.",
            "baking")

    println(food.toString())
    println(food1.toString())
    println("food hash: ${food.hashCode()}")
    println("food1 hash: ${food1.hashCode()}")
    println(food == food1)

    val paper = Paper("offset",
            "A4",
            "white")
    val paper1 = Paper("offset",
            "A5",
            "white")

    println(paper.toString())
    println(paper1.toString())
    println("paper hash: ${paper.hashCode()}")
    println("paper1 hash: ${paper1.hashCode()}")
    println(paper == paper1)

    val boiler = Boiler("Ariston",
            85,
            "white")
    val boiler1 = Boiler("Ariston",
            85,
            "white")
    val boiler2 = Boiler("Thermo Lux",
            50,
            "silver")

    println(boiler.toString())
    println(boiler1.toString())
    println(boiler2.toString())
    println("boiler hash: ${boiler.hashCode()}")
    println("boiler1 hash: ${boiler1.hashCode()}")
    println("boiler2 hash: ${boiler2.hashCode()}")
    println(boiler == boiler1)
    println(boiler == boiler2)
    println(boiler1 ==boiler2)

    val battery = Battery("Duracell",
            "AA",
            "black with gold",
            true)
    val battery1 = Battery("Duracell",
            "AA",
            "black with gold",
            true)

    println(battery.toString())
    println(battery1.toString())
    println("battery hash: ${battery.hashCode()}")
    println("battery1 hash: ${battery1.hashCode()}")

    val liquid = Liquid("Water",
            500,
            "transparent")
    val liquid1 = Liquid("Soup",
            200,
            "pink")

    println(liquid.toString())
    println(liquid1.toString())
    println("liquid hash: ${liquid.hashCode()}")
    println("liquid1 hash: ${liquid1.hashCode()}")
    println(liquid == liquid1)

    val cup = Cup("grey",
            "middle",
            "ceramics",
            "coffee or tea")
    val cup1 = Cup("white",
            "small",
            "ceramics",
            "coffee")
    val cup2 = Cup("transparent",
            "middle",
            "glass",
            "coffee or tea")

    println(cup.toString())
    println(cup1.toString())
    println(cup2.toString())
    println("cup hash: ${cup.hashCode()}")
    println("cup1 hash: ${cup1.hashCode()}")
    println("cup2 hash: ${cup2.hashCode()}")
    println(cup == cup1)
    println(cup == cup2)
    println(cup2 == cup1)

    val box = Box("big",
            "craft",
            "black",
            "present",
            true)
    val box1 = Box("big",
            "cardboard",
            "brown",
            "all",
            true)

    println(box.toString())
    println(box1.toString())
    println(" box hash: ${box.hashCode()}")
    println(" box1 hash: ${box1.hashCode()}")
    println(box == box1)

    val student = Student("Jack",
            "Williams",
            22,
            "Harvard University",
            "painter",
            "baseball")
    val student1 = Student("Jack",
            "Williams",
            22,
            "Harvard University",
            "painter",
            "baseball")


    println(student.toString())
    println(student1.toString())
    println("student hash: ${student.hashCode()}")
    println("student1 hash: ${student1.hashCode()}")
    println(student == student1)

    val companyEmployee = CompanyEmployee("Daniyar",
            "Murzakulov",
            34,
            12,
            "back office",
            "Leading Specialist",
            20000)
    val companyEmployee1 = CompanyEmployee("Azamat",
            "Alymkulov",
            26,
            4,
            "audit",
            "Specialist",
            15000)

    println(companyEmployee.toString())
    println(companyEmployee1.toString())
    println("Employee hash: ${companyEmployee.hashCode()}")
    println("Employee1 hash: ${companyEmployee1.hashCode()}")
    println(companyEmployee == companyEmployee1)

    val book = Book("Просто Маса",
            "Борис Акунин",
            2020)
    val book2 = book.copy(name = "Статский советник", year = 2018)
    println(book.toString())
    println(book2.toString())


}


data class Book(val name: String,
                val author: String,
                val year: Int)

