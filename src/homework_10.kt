


fun main(){

    val itemCosts = mapOf("Хлеб" to 50.0, "молоко" to 55.0, "йогурт" to 75.0)
    val shoppingList = listOf("Хлеб", "молоко", "йогурт", "сметана")

    var costs = 0.0

    for (item in shoppingList){
        val itemCost = itemCosts[item]
        if(itemCost != null){
            costs += itemCost
        }
    }
    println("Стоимость покупки $costs")
}



