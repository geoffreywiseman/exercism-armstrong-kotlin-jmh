import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

abstract class ArmstrongTest {

    abstract fun check(x: Int): Boolean

    @Test
    fun `zero is an armstrong number`() = assertTrue(check(0))

    @Test
    fun `single digit numbers are armstrong numbers`() = assertTrue(check(5))

    @Test
    fun `there are no 2 digit armstrong numbers`() = assertFalse(check(10))

    @Test
    fun `three digit number that is an armstrong number`() = assertTrue(check(153))

    @Test
    fun `three digit number that is not an armstrong number`() = assertFalse(check(100))

    @Test
    fun `four digit number that is an armstrong number`() = assertTrue(check(9474))

    @Test
    fun `four digit number that is not an armstrong number`() = assertFalse(check(9475))

    @Test
    fun `seven digit number that is an armstrong number`() = assertTrue(check(9926315))

    @Test
    fun `seven digit number that is not an armstrong number`() = assertFalse(check(9926314))
}
