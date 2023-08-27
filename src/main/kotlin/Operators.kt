fun main() {

    val a = 5
    val b = 3.0

    val sum = a + b
    val difference = a - b
    val produce = a * b
    val division = a / b
    val modulo = a % b

    println("\nSum of a and b is $sum")
    //OR
    println("Sum of a and b is ${a+b}\n")

    println("Difference of a and b is $difference")
    println("Product of a and b is $produce")
    println("Division of a and b is $division")
    println("Remainder of division of a and b is $modulo\n")

    var x = 0

    println("x = ${x++}") //Here we print x first and then increment with ++
    println("x = ${++x}\n") //Here we increment first then print x

    //Same case here using decrement
    println("x = ${x--}")
    println("x = ${--x}\n")

    val isTalking = true
    val isActive = true

    // && is AND operator
    if (isTalking && isActive)
    {
        println("User is active")
        println("User is typing...\n")
    }
    else if (isActive)
    {
        println("User is active\n")
    }
    else
    {
        println("User is offline\n")
    }

    val num1 = 4
    val num2 = 5

    if (num1 == 4 || num2 == 2)
    {
        println("Condition is true")
    }
    else
    {
        println("Condition is false")
    }

}