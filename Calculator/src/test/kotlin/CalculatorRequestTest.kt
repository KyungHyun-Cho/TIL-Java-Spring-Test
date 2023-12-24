import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

/**
 * @author Kyunghyun Cho
 */
class CalculatorRequestTest {

    @Test
    fun `올바른 요청이 왔을 때 잘 파싱을 하는가?`() {
        // given
        val input = listOf("2", "+", "4")

        // when
        val requestModel = CalculatorRequest.createBy(input)

        // then
        assertEquals(2L, requestModel.num1)
        assertEquals("+", requestModel.operator)
        assertEquals(4L, requestModel.num2)
    }

    @Test
    fun `긴 숫자도 잘 파싱을 하는가?`() {
        // given
        val input = listOf("234", "+", "456789")

        // when
        val requestModel = CalculatorRequest.createBy(input)

        // then
        assertEquals(234L, requestModel.num1)
        assertEquals("+", requestModel.operator)
        assertEquals(456789L, requestModel.num2)
    }

    @Test
    fun `더 많은 파라미터 요청이 들어오면 익셉션을 발생하는가?`() {
        // given
        val input = listOf("2", "+", "4", "?")

        // when
        // then
        assertThrows(RuntimeException::class.java) {
            CalculatorRequest.createBy(input)
        }
    }

    @Test
    fun `연산자의 글자수가 1이 아니면 익셉션을 발생하는가?`() {
        // given
        val input = listOf("2", "+-", "4")

        // when
        // then
        assertThrows(RuntimeException::class.java) {
            CalculatorRequest.createBy(input)
        }
    }

    @Test
    fun `지정된 연산자 이외의 연산자가 들어오면 익셉션을 발생하는가?`() {
        // given
        val input = listOf("2", "x", "4")

        // when
        // then
        assertThrows(RuntimeException::class.java) {
            CalculatorRequest.createBy(input)
        }
    }
}
