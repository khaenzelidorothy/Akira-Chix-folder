//fun main() {
//    var friends = arrayOf("ushi", "queen", "mercy", "margaret", "kevine")
//    println(friends[2])
//    println(friends.contentToString())
//    println(friends[3])
//    println(friends::class.simpleName)
//
//    val years = arrayOf(1995, 1997, 2001, 2007, 2013, 2022)
//    println(years.contentToString())
//
//    val southAfrica = arrayOf("Cyril Ramaphosa", 63210000, false, "Random")
//    println(southAfrica.contentToString())
//
//    friends.set(2, "Dorothy")
//    friends[3] = "David"
//    println(friends.contentToString())
//
//    friends = friends.plus("Fransica")
//    friends = friends.plus(arrayOf("Adam", "Beth"))
//    println(friends.contentToString())
//
//    println(friends.indexOf("Abby"))
//
//    val nums = arrayOf(13, 27, 31, 65, 34, 21)
//    println(nums.size)
//    println(nums.count())
//    println(nums.sum())
//    println(nums.average())
//    println(nums.min())
//    println(nums.max())
//
//    for (friend in friends) {
//        println(friend)
//    }
//    for (x in friends) {
//        println(x)
//    }
//    for (num in nums){
//        val square =num*num
//        println("The square of $num is : $square")
//    }
//    friends.forEach { friend-> println(friend) }
//    nums.forEach { num ->
//        val square = num *num
//        println("The square of $num is : $square")
//    }
//    //sorting arrays
//    val sortedNums = nums.sortedArray()
//    println(sortedNums.contentToString())
//
//
//    val sortedNum = nums.sortedArrayDescending()
//    println(sortedNum.contentToString())
//
//    val sortedFriends = friends.sortedArray()
//    println(sortedFriends.contentToString())
////    prints a list other than array, creates a copy
//    println(nums.contentToString())
//    val x = nums.sorted()
//    println(x)
//
//}
