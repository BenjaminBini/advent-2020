import java.io.File

fun day1(fileName: String): Pair<() -> String, () -> String> {
    fun task1(inputs: Sequence<Int>): () -> String {
        return fun(): String {
            inputs.forEachIndexed { index, itemA ->
                inputs.drop(index).forEach { itemB ->
                    if (itemA + itemB == 2020) {
                        return (itemA * itemB).toString()
                    }
                }
            }
            return "ERROR"
        }
    }

    fun task2(inputs: Sequence<Int>): () -> String {
        return fun(): String {
            inputs.forEachIndexed { index, itemA ->
                inputs.drop(index).forEachIndexed { indexB, itemB ->
                    inputs.drop(indexB).forEach { itemC ->
                        if (itemA + itemB + itemC == 2020) {
                            return (itemA * itemB * itemC).toString()
                        }
                    }
                }
            }
            return "ERROR"
        }

    }

    val lines = File("src/main/resources/$fileName").readLines()
    val inputs = lines.asSequence().map { r -> r.toInt() }
    return Pair(task1(inputs), task2(inputs))
}