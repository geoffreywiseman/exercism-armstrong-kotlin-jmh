import kotlin.math.pow

// https://exercism.org/tracks/kotlin/exercises/armstrong-numbers/solutions/floby-ip
object FlobyIpArmstrong {
    fun check(input: Int): Boolean = input.toString().let {
        it.chars()
                .map { c -> Character.getNumericValue(c) }
                .asDoubleStream()
                .map { d -> d.pow(it.length) }
                .sum() == input.toDouble()
    }
}
