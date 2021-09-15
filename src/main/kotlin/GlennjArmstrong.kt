import kotlin.math.log10

// https://exercism.org/tracks/kotlin/exercises/armstrong-numbers/solutions/glennj
fun Int.pow(exponent: Int): Int {
    require(exponent >= 0)
    return (1..exponent).fold(1) { acc, _ -> acc * this }
}

object GlennjArmstrong {
    fun check(input: Int): Boolean {
        val len = (log10(input.toFloat()) + 1).toInt()
        var armstrongSum = 0
        var n = input
        while (n > 0) {
            armstrongSum += (n % 10).pow(len)
            n /= 10
        }
        return input == armstrongSum
    }
}
