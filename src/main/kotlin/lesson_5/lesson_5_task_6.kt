package org.example.lesson_5

const val VALUE_100 = 100
const val VALUE_18_5 = 18.5
const val VALUE_25_0 = 25.0
const val VALUE_30_0 = 30.0

fun main() {
    print("Введите рост пользователя в см: ")
    val userGrownMetre = readln().toFloat() / VALUE_100

    print("Введите вес пользователя в кг: ")
    val userWeight = readln().toFloat()

    val bodyMassIndex = userWeight / (userGrownMetre * userGrownMetre)

    val textResult = when {
        (bodyMassIndex < VALUE_18_5) -> "недостаточная масса тела"
        (bodyMassIndex < VALUE_25_0) -> "нормальная масса тела"
        (bodyMassIndex < VALUE_30_0) -> "избыточная масса тела"
        else ->"ожирение"
    }

    println("\nИндекс массы тела = ${"%.2f".format(bodyMassIndex)} \nKатегория веса: $textResult")
}