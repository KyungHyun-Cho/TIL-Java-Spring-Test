import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

/**
 * @author Kyunghyun Cho
 */
class CalculatorTest {

    @Test
    fun `덧셈 연산을 할 수 있다`(){
        // given
        val calculator = Calculator()
        val (num1, num2) = 2L to 3L
        val operator = "+"

        // when
        val result = calculator.calculate(num1, num2, operator)

        // then
        assertEquals(5, result)
    }

    @Test
    fun `뺄셈 연산을 할 수 있다`(){
        // given
        val calculator = Calculator()
        val (num1, num2) = 3L to 2L
        val operator = "-"

        // when
        val result = calculator.calculate(num1, num2, operator)

        // then
        assertEquals(1, result)
    }

    @Test
    fun `곱셈 연산을 할 수 있다`(){
        // given
        val calculator = Calculator()
        val (num1, num2) = 2L to 3L
        val operator = "*"

        // when
        val result = calculator.calculate(num1, num2, operator)

        // then
        assertEquals(6, result)
    }

    @Test
    fun `나눗셈 연산을 할 수 있다`(){
        // given
        val calculator = Calculator()
        val (num1, num2) = 6L to 3L
        val operator = "/"

        // when
        val result = calculator.calculate(num1, num2, operator)

        // then
        assertEquals(2, result)
    }

    @Test
    fun `잘못된 연산 기호가 들어온 경우`(){
        // given
        val calculator = Calculator()
        val (num1, num2) = 2L to 3L
        val operator = "x"

        // when then
        assertThrows(java.lang.Exception::class.java) {
            val result = calculator.calculate(num1, num2, operator)
        }
    }
}
