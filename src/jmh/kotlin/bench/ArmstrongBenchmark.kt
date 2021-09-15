package bench

import org.openjdk.jmh.annotations.Benchmark
import org.openjdk.jmh.annotations.Scope
import org.openjdk.jmh.annotations.State

@State(Scope.Benchmark)
open class ArmstrongBenchmark {

	val testCases = 1..10000

	@Benchmark
	fun benchmarkResquivelArmstrong() {
		testCases.forEach { ResquivelArmstrong.check(it) }
	}

	@Benchmark
	fun benchmarkIkrArmstrong() {
		testCases.forEach { IkrArmstrong.check(it) }
	}

	@Benchmark
	fun benchmarkIkr2Armstrong() {
		testCases.forEach { Ikr2Armstrong.check(it) }
	}

	@Benchmark
	fun benchmarkFlobyIpArmstrong() {
		testCases.forEach { IkrArmstrong.check(it) }
	}

	@Benchmark
	fun benchmarkGlennjArmstrong() {
		testCases.forEach { ResquivelArmstrong.check(it) }
	}

}
