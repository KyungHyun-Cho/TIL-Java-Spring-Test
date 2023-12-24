/**
 * @author Kyunghyun Cho
 */

class CalculatorApplication

fun main(){
    print("Enter two numbers and an operator (e.g 1 + 2) : ")
    val input = readLine()!!

    val parts = input.split(" ")
    val num1 = parts[0].toLong()
    val num2 = parts[2].toLong()
    val operator = parts[1]

    val answer = when(operator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> throw Exception()
    }.also {
        println(it)
    }
}
