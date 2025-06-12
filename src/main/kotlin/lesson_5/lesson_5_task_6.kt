package org.example.lesson_5

const val value_100 = 100
const val value_18_5 = 18.5
const val value_25_0 = 25.0
const val value_30_0 = 30.0

fun main() {
    print("Введите рост пользователя в см: ")
    val userGrownMetre = readln().toFloat() / value_100

    print("Введите вес пользователя в кг: ")
    val userWeight = readln().toFloat()

    val bodyMassIndex = userWeight / (userGrownMetre * userGrownMetre)

    val textResult = when {
        (bodyMassIndex < value_18_5) -> "недостаточная масса тела"
        (bodyMassIndex < value_25_0) -> "нормальная масса тела"
        (bodyMassIndex < value_30_0) -> "избыточная масса тела"
        else ->"ожирение"
    }


    println("\nИндекс массы тела = ${String.format("%.2f", bodyMassIndex)} \nKатегория веса: $textResult")
}