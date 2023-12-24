/**
 * @author Kyunghyun Cho
 */
class Calculator {
    fun calculate(num1: Long, num2: Long, operator: String): Long {
        return when(operator){
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> num1 / num2
            else -> throw Exception()
        }
    }
}
