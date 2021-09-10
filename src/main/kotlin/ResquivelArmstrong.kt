import java.lang.Character.getNumericValue
import kotlin.math.pow

object ResquivelArmstrong {
    fun check(input: Int): Boolean = input.toString().let { stringInput ->
        stringInput.map { digit -> getNumericValue(digit).toFloat().pow(stringInput.length) }.sum()
    } == input.toFloat()
}
