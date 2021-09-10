# Benchmarks for the Exercism Armstrong exercise in Kotlin

After seeing a few different pangram implementations in Kotlin while mentoring the exercise on Exercism, I became curious about how the different approaches performed, so I threw a few implementations together with JMH to compare them.

## See Also

* [Exercism](http://exercism.io)
* [Kotlin Track](https://exercism.io/tracks/kotlin)

## Implementations

First two implementations are from:
- Resquivel
- Ikr

## Results

Can run benchmarks like this: `gradle jmh`

```
# Run complete. Total time: 00:16:44

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                        Mode  Cnt    Score    Error  Units
ArmstrongBenchmark.benchmarkIkrArmstrong        thrpt   25  958.268 ± 13.780  ops/s
ArmstrongBenchmark.benchmarkResquivelArmstrong  thrpt   25  707.781 ± 32.571  ops/s

Benchmark result is saved to /Users/geoffrey/work/learning/exercism/kotlin/exercism-armstrong-jmh/build/reports/jmh/results.txt
```
