import java.io.File

fun day3(fileName: String): Pair<() -> String, () -> String> {
    fun task1(inputs: Sequence<String>): () -> String {
        return fun(): String {
            return "TODO"
        }
    }

    fun task2(inputs: Sequence<String>): () -> String {
        return fun(): String {
            return "TODO"
        }
    }

    val lines = File("src/main/resources/$fileName").readLines()
    val inputs = lines.asSequence()
    return Pair(task1(inputs), task2(inputs))
}