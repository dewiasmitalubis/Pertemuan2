fun main() {
    println("Exponent calculator")
    println("===================")
    println("Enter the base: ")
    val a = readLine()!!.toInt()
    println("Enter the exponent: ")
    val n = readLine()!!.toInt()
    var result = a
    for (i in 1 until n) {
        result *= a
    }
    println("Result: $result")
    println("Thank you for using our exponent calculator")
}