import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.*

fun sumList(numbers: List<Int>): Int {
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}

fun sumListParallel(numbers: List<Int>, coroutineContext: CoroutineContext = Dispatchers.Default): Int {
    return runBlocking(coroutineContext) {
        numbers.chunked(numbers.size / Runtime.getRuntime().availableProcessors()).map { chunk -> 
            async {
                chunk.sum() 
            }
        }.awaitAll().sum()
    }
}

fun main() {
    val numbers = List(1_000_000) { (1..10).random() }

    val startTimeSequential = System.currentTimeMillis()
    println("Suma total secuencial: ${sumList(numbers)}")
    val endTimeSequential = System.currentTimeMillis()
    println("Tiempo de ejecución secuencial: ${endTimeSequential - startTimeSequential} ms")

    val startTimeParallel = System.currentTimeMillis()
    println("Suma total paralela: ${sumListParallel(numbers)}")
    val endTimeParallel = System.currentTimeMillis()
    println("Tiempo de ejecución paralela: ${endTimeParallel - startTimeParallel} ms")
}
