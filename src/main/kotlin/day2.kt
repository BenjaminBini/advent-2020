import java.io.File

fun day2(fileName: String): Pair<() -> String, () -> String> {
    fun task1(inputs: Sequence<String>): () -> String {
        return fun(): String {
            var validItems = 0
            inputs.forEach { input ->
                val min = input.split("-")[0].toInt()
                val max = input.split("-")[1].takeWhile { it != ' ' }.toInt()
                val char = input.split(":")[0].toCharArray().last()
                val content = input.split(":")[1].drop(1)
                val count = content.filter { it == char }.count()
                if (count in min..max) {
                    validItems++
                }
            }
            return validItems.toString()
        }
    }

    fun task2(inputs: Sequence<String>): () -> String {
        return fun(): String {
            var validItems = 0
            inputs.forEach { input ->
                val index1 = input.split("-")[0].toInt() - 1
                val index2 = input.split("-")[1].takeWhile { it != ' ' }.toInt() - 1
                val char = input.split(":")[0].toCharArray().last()
                val content = input.split(":")[1].drop(1)
                if ((content[index1] == char).xor(content[index2] == char)) {
                    validItems++
                }
            }
            return validItems.toString()
        }
    }

    val lines = File("src/main/resources/$fileName").readLines()
    val inputs = lines.asSequence()
    return Pair(task1(inputs), task2(inputs))
}