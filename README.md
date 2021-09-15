# Benchmarks for the Exercism Armstrong exercise in Kotlin

After seeing a few different pangram implementations in Kotlin while mentoring the exercise on Exercism, I became curious about how the different approaches performed, so I threw a few implementations together with JMH to compare them.

## See Also

* [Exercism](http://exercism.io)
* [Kotlin Track](https://exercism.io/tracks/kotlin)

## Implementations

So far the implementations are from:
- Resquivel
- Ikr (two versions)
- Floby-Ip
- Glennj

## Results

Can run benchmarks like this: `gradle jmh`

```
# Run complete. Total time: 00:41:50

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                        Mode  Cnt     Score    Error  Units
ArmstrongBenchmark.benchmarkFlobyIpArmstrong    thrpt   25  1091.216 ± 13.060  ops/s
ArmstrongBenchmark.benchmarkGlennjArmstrong     thrpt   25   916.523 ± 40.914  ops/s
ArmstrongBenchmark.benchmarkIkr2Armstrong       thrpt   25   709.004 ±  6.248  ops/s
ArmstrongBenchmark.benchmarkIkrArmstrong        thrpt   25  1106.606 ± 18.187  ops/s
ArmstrongBenchmark.benchmarkResquivelArmstrong  thrpt   25   911.705 ± 39.769  ops/s
```
