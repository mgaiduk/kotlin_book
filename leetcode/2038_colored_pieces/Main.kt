fun winnerOfGame(colors: String): Boolean {
    var aInARow = 0
    var bInARow = 0
    var aliceScore = 0
    var bobScore = 0
    for (char in colors) {
        if (char == 'A') {
            aInARow++
            bInARow = 0
            if (aInARow >= 3) {
                aliceScore++
            }
        } else {
            bInARow++
            aInARow = 0
            if (bInARow >= 3) {
                bobScore++
            }
        }
    }
    return (aliceScore > bobScore)
}

fun main(args: Array<String>) {
    println(winnerOfGame(args[0]))
}