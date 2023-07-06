object PatternMatchingExample extends App {
  
    println("Enter a number:")
    val input = scala.io.StdIn.readDouble()

    val result = input match {
        case n if n <= 0 => "Negative/Zero is input"
        case n if n % 2 == 0 => "Even number is given"
        case _ => "Odd number is given"
    }

    println(result)
}
