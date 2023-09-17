fun main() {

        // Write a Kotlin program to calculate the factorial of a number.

        println("Enter an Integer value to get it's Factorial")
        val userInput = readln().toInt()
        var factorial = 1
        if(userInput ==0 && userInput ==1){
            println("Factorial of $userInput is: 1")
        }
        else{
            for(item in 1..userInput){
                factorial *= item
            }
            println(factorial)
        }


}