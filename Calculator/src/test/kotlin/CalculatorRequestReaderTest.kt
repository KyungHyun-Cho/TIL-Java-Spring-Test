import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.ByteArrayInputStream

/**
 * @author Kyunghyun Cho
 */
class CalculatorRequestReaderTest {
    @Test
    fun `readln 으로 데이터를 읽어들일 수 있다`() {
        // given
        val calculatorRequestReader = CalculatorReaquestReader()

        // when
        System.setIn(ByteArrayInputStream("2 + 4".toByteArray()))
        val result = calculatorRequestReader.read()

        // then
        assertEquals(2L, result.num1)
        assertEquals("+", result.operator)
        assertEquals(4L, result.num2)

    }
}
