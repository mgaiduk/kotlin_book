private fun<T> min(a: T, b: T): T where T: Comparable<T> {
    return if (a < b) a else b
}

fun main() {
    println(min(1, 2));
}