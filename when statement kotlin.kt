/*
 * Testing for many different outcomes, or cases, is very common in programming. 
 * Sometimes, the list of possible outcomes can be very long. For example, if you were rolling a 12-sided dice, 
 * you'd have 11 else if statements between the success and the final else. 
 * To make these kinds of statements easier to write and read, which helps avoid errors, 
 * Kotlin makes available a when statement.
 */
 
 fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

/*
 * A when statements starts with the keyword when, followed by parentheses (). 
 * Inside the parentheses goes the value to test. 
 * This is followed by curly braces {} for the code to execute for different conditions.
 */
    when (rollResult) {
        luckyNumber -> println("You won!")  // Read this as, "If rollResult is luckyNumber, then print the "You win!" message."
        
        /*
         * luckyNumber -> println("You win!")
         *
         * This means:
         *
         * You first put the value you are comparing to rollResult. That's luckyNumber.
         * Follow that with an arrow (->).
         * Then add the action to perform if there is a match.
         */
         
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        4 -> println("No luck! You rolled a 4. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
