/**
 * @author Kyunghyun Cho
 */

class CalculatorApplication

fun main(){
    val parts = CalculatorReaquestReader().read()
    val calculator = Calculator()

    with(parts) {
        println(calculator.calculate(num1, num2, operator))
    }
}
