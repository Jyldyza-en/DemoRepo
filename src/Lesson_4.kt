


fun main(){
    var a = 10
    val b = 3

    println("-a = ${-a}")// сделать чило отрицательным

    println("a++ : ${a++}")//++ увелич число на 1 единицу
    println("++a : ${++a}")//если ++ стоит после числа, то он вернет само число в консоль, но потом сразу добавит к нему 1
                           //если ++ стоит перед числом, то он сразу вернет число+1
    println("a-- : ${a--}")//наоборот
    println("--a : ${--a}")

    println("a+b = ${a+b}")
    println("a-b = ${a-b}")
    println("a*b = ${a*b}")
    println("a/b = ${a/b}")
    println("a%b = ${a%b}")

    println("2+2*5 = ${(2+2)*5}")

    a += 2
    println("a += 2: $a")
    a -= 2
    println("a -= 2: $a")
    a *= 2
    println("a *= 2: $a")
    a /= 2
    println("a /= 2: $a")
    a %= 2
    println("a %= 2: $a")

}