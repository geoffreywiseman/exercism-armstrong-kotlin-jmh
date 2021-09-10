object IkrArmstrong {
    fun check(x: Int): Boolean {
        val ds = digitsReversed(x)
        return x == ds.map({ quickPow(it, ds.size) }).sum()
    }
}

private fun digitsReversed(x: Int): List<Int> {
    if (x == 0) return listOf(0)

    var r = x
    val ans = mutableListOf<Int>()
    while (r > 0) {
        ans += r % 10
        r /= 10
    }

    return ans;
}

private fun quickPow(base: Int, exp: Int): Int {
    if (exp == 0) return 1;

    return if (exp % 2 == 0) {
        val q = quickPow(base, exp / 2)
        q * q
    } else {
        base * quickPow(base, exp - 1)
    }
}
