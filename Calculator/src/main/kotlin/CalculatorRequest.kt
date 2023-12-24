/**
 * @author Kyunghyun Cho
 */
data class CalculatorRequest(
    val num1: Long,
    val num2: Long,
    val operator: String,
) {
    companion object {
        fun createBy(input: List<String>): CalculatorRequest {
            if (input.size != 3) throw RuntimeException()
            if (input[1].length != 1) throw RuntimeException()
            if (input[1] !in setOf("+", "-", "*", "/")) throw RuntimeException()

            return CalculatorRequest(
                num1 = input[0].toLong(),
                num2 = input[2].toLong(),
                operator = input[1],
            )
        }
    }
}
