fun main(){
   printbestFriend( "Fiona")
   printbestFriend("Mutoni")
   printbestFriend("Wangara")
   printbestFriend("Mercy")
  var result = subtract(5, 4)
   println(result)

  printAvgAge()
    printRemainder()
    printSum()
    printName("dorothy")
}
fun printbestFriend(bestie: String){
   println("My best friend is " +bestie)
}
fun subtract(num1:Int, num2:Int): Int{
   var difference = num1 - num2
   return difference

}
fun calcAvgAge(age1:Int, age2:Int, age3:Int): Double{
   val avg = (age1+age2+age3)/3.0
   return avg
}
fun printAvgAge(){
   val avgAge = calcAvgAge(21, 20, 22)
   println("The average age of my friends is " +avgAge)
}
fun calcRemainder( num1: Int, num2: Int): Int{
    var remainder = num1 % num2
    return remainder
}
fun printRemainder(){
    var remainder = calcRemainder(12,7)
    println(remainder)
}
fun calcSum(num1: Int, num2: Int, num3: Int, num4: Int): Int {
    var sum = ( num1+num2+num3+num4)
    return sum
}
fun printSum(){
    var sum = calcSum(35, 96, 32, 87)
    println(sum)
}
fun printName(name: String){
    println("Hello $name")
}


