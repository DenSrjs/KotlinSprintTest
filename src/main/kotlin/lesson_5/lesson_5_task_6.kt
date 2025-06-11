package org.example.lesson_5

fun main() {
    print("Введите рост пользователя в см: ")
    val userGrownMetre: Float = (readln().toFloat()) / 100

    print("Введите вес пользователя в кг: ")
    val userWeight: Float = readln().toFloat()

    val bodyMassIndex: Float = (userWeight / (userGrownMetre * userGrownMetre))

    val textResult = if (bodyMassIndex < 18.5) "недостаточная масса тела"
    else if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) "нормальная масса тела"
    else if (bodyMassIndex >= 25 && bodyMassIndex < 30) "избыточная масса тела"
    else "ожирение"

    println("\nИндекс массы тела = ${String.format("%.2f", bodyMassIndex)} \nKатегория веса: ${textResult}")
}