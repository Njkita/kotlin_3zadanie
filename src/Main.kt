fun scalarMultiplication(matrix1: Array<DoubleArray>, matrix2: Array<DoubleArray>): Double {
    if (matrix1.isEmpty() || matrix2.isEmpty() || matrix1[0].size != matrix2.size) {
        throw IllegalArgumentException("Invalid input matrices")
    }

    val numRows = matrix1.size
    val numCols = matrix2[0].size
    var result = 0.0

    for (i in 0 until numRows) {
        for (j in 0 until numCols) {
            result += matrix1[i][j] * matrix2[j][i]
        }
    }

    return result
}

fun main() {
    val matrix1 = arrayOf(doubleArrayOf(1.0, 2.0, 3.0),
        doubleArrayOf(3.0, 4.0, 5.0),
        doubleArrayOf(3.0, 4.0, 5.0))

    val matrix2 = arrayOf(doubleArrayOf(5.0, 6.0, 7.0),
        doubleArrayOf(7.0, 8.0, 9.0),
        doubleArrayOf(3.0, 4.0, 5.0))

    try {
        val scalarProduct = scalarMultiplication(matrix1, matrix2)
        println("Скалярное произведение: $scalarProduct")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}