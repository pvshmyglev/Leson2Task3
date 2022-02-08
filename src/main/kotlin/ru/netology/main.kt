package ru.netology

fun main() {

    val musicLover : Boolean = true
    val discountMusicLover : Int = 1
    val sumLastSales : Int = 548098
    val sumSale : Int = 350550

    val discountOfLastSales =
        if (sumLastSales < 100100) 0
        else if (sumLastSales < 1000100 && sumSale < 10000) sumSale
        else if (sumLastSales < 1000100) 10000
        else sumSale * 5 / 100
    val discountOfMusicLover = if (musicLover) (sumSale - discountOfLastSales) * discountMusicLover / 100 else 0

    val result = sumSale - discountOfLastSales - discountOfMusicLover

    println("Сумма покупки: ${sumSale / 100} руб. ${sumSale % 100} коп.")
    println("Скидка накопительная: ${discountOfLastSales / 100} руб. ${discountOfLastSales % 100} коп.")
    println("Скидка постоянного клиента: ${discountOfMusicLover / 100} руб. ${discountOfMusicLover % 100} коп.")
    println("Итого к оплате: ${result / 100} руб. ${result % 100} коп.")

}