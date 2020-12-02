fun main() {
    runDay(1, day1("day-1"))
    runDay(2, day2("day-2"))
    runDay(3, day2("day-3"))
}

fun runDay(day: Int, dayTasks: Pair<() -> String, () -> String>) {
    println("Day $day - Task 1: ${dayTasks.first()}")
    println("Day $day - Task 2: ${dayTasks.second()}")
}
