import kotlin.math.pow

object Ikr2Armstrong {
    fun check(x: Int): Boolean {
        val digits = "$x".map(Character::getNumericValue)
        return x == digits.map { it.toDouble().pow(digits.size).toInt() }.sum()
    }
}
