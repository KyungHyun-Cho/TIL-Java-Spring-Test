/**
 * @author Kyunghyun Cho
 */
class CalculatorReaquestReader {
    fun read(): CalculatorRequest {
        print("Enter two numbers and an operator (e.g 1 + 2) : ")
        return CalculatorRequest.createBy(readLine()!!.split(" "))
    }
}
