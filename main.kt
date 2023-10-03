import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    print("Enter action:")
    val action = readln()

    try {
        if (action.equals("r")) {
            print("Enter nums/num:")
            val str0 = readln()
            val num1 = str0.toDouble()

            val result = recursion(num1)
            println("recursion of $num1 is $result")
        } else if (action.equals("sqrt")){
            print("Enter a: ")
            val aStr = readln()
            val a = aStr.toDouble()

            print("Enter b: ")
            val bStr = readln()
            val b = bStr.toDouble()

            print("Enter a: ")
            val cStr = readln()
            val c = cStr.toDouble()

            quadratic(a,b,c)
        } else {

            print("Enter nums/num:")
            val str1 = readln()
            val num2 = str1.toDouble()

            print("Enter nums/num:")
            val str2 = readln()
            val num3 = str2.toDouble()


            if (action.equals("+")) {
                println("sum of $num2 and $num3 is ${num2 + num3}")
            } else if (action.equals("-")) {
                println("decrease of $num2 and $num3 is ${num2 - num3}")
            } else if (action.equals("/")) {
                println("subtraction of $num2 and $num3 is ${num2 / num3}")
            } else if (action.equals("*")) {
                println("multiplication of $num2 and $num3 is ${num2 * num3}")
            } else {
                println("Unexpected error")
            }
        } }catch (e: NumberFormatException) {
        println("Please enter nums")
    }
}


fun recursion(a: Double): Double {
    return if (a <= 1) {
        1.0
    } else {
        a * recursion(a - 1)
    }
}


fun quadratic(a: Double, b: Double, c: Double): Double{
    val D = b.pow(2.0) - 4 * a * c
    if (D == 0.0){
        val x = -b / 2 * a
        println("There 1 root(both the same)$x")
    } else if (D < 0){
        println("There is no roots")
    } else if (D > 0){
        val x1 = (-b + sqrt(D)) / 2.0 * a
        val x2 = (-b - sqrt(D)) / 2.0 * a
        println("There are two roots $x1 and $x2")
    }

    return  D
}