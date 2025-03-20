//fun main(){
//    val person ="Janet"
//    val profession = "architect"
//    println(person + " is an " + profession)
//    println("$person is an $profession")
//}
//fun main(){
//    val name = "Joy"
//    val age = 19
//    var birthYear = 2025 - age
//    println("$name was born in $birthYear")
//}
//fun main(){
//    val os = "ubuntu"
//    println(os[0])
//    println(os[1])
//    println(os[2])
//    println(os[3])
//    println(os[4])
//    println(os[5])
//    println(os[6])
//}
//fun main(){
//    val os = "ubuntu"
//    val name ="ubuntu"
//    println(os.equals(name))
//}
//fun main(){
//    val os = "ubuntu"
//    println(os.uppercase())
//    println(os.lowercase())
//}
//fun main(){
//    val a =""
//    val b =" "
//    println(a.isEmpty())
//    println(a.isBlank())
//    println(b.isBlank())
//    println(b.isEmpty())
//}
//fun main() {
//    val name = " Patricia"
//    println(name)
//    println(name.trim())
//    println(name.trimStart())
//    println(name.trimEnd())
//}
//fun main() {
//    val fullName = "Pamela Kilonzo"
//    println(fullName.startsWith(prefix = "P"))
//    println(fullName.endsWith(suffix = "nzo"))
//
//}
//fun main() {
//    var stmt = "Phoebe is our class representative"
//    stmt = stmt.replace(oldValue = "Phoebe", newValue = "Victoria")
//    println(stmt)
//}
//fun main() {
//    var stmt = "Phoebe is our class representative"
//    val words = stmt.split(" " )
//    println(words)
//}
fun main() {
    printName("x", 20)
    val y = " I am 20 years old"
    println(y.length)
    nameOfSubjects()
    school("Akirachix")
    var z = "Akirachix"
    println("${z[0]} ${z[2]} ${z[3]}")
    printNumbers()
    var subtract = 30 -20
    println(subtract)
    var num = 12
    println(++num)
    println("I love you")
    var fullName= "Dorothy" +  "Mbakaya"
    println(fullName)
    println("My name is" +""+ "Dorothy")
    var stmt = "Phoebe is our class representative"
//    val words = stmt.split(" ," )
    println(stmt.split(" ," ))
}
    fun printNumbers() {
        val numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
        val sum = numbers[1] + numbers[4]
        val sortedNumbers = numbers.sortedArray()
        println(numbers.indexOf(158))
        println(sortedNumbers.contentToString())
        val num  = 20.3
        println(num::class.simpleName)
    }

fun printName(name:String,age:Int){
    println("Hi, my name is $name and I am $age years old")
}
fun nameOfSubjects(){
    var subjects = arrayOf("Mathematics", "english", "physics", "Biology")
    println(subjects.contentToString())
}
fun nameOfCities(){
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    println(cities)
}
//val printNumbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
//val sum = printNumbers[1] + printNumbers[4]

fun school(sName:String){
    println("${sName[0]} ${sName[2]} ${sName[3]}")
}





