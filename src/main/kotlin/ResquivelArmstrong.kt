import java.lang.Character.getNumericValue
import kotlin.math.pow

// https://exercism.org/tracks/kotlin/exercises/armstrong-numbers/solutions/resquivel
object ResquivelArmstrong {
    fun check(input: Int): Boolean = input.toString().let { stringInput ->
        stringInput.map { digit -> getNumericValue(digit).toFloat().pow(stringInput.length) }.sum()
    } == input.toFloat()
}
