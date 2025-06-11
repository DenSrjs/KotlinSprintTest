package org.example.lesson_5

fun main(){
    print("Введите расстояние поездки в км: ")
    val travelDistance: Float = readln().toFloat()

    print("Введите расход топлива на 100км в литрах: ")
    val fuelConsumption: Float = readln().toFloat()

    print("Введите текущую цену за литр топлива: ")
    val priceLiterFuel: Float = readln().toFloat()

    val totalAmountFuel = (travelDistance * fuelConsumption) / 100
    val totalCostFuel = totalAmountFuel * priceLiterFuel

    println("\nОбщее количество топлива которое необходимо для поездки: ${String.format("%.2f",totalAmountFuel)} л." +
            "\nОбщая стоимость топлива: ${String.format("%.2f", totalCostFuel)}")
}
