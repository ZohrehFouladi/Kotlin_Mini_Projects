fun main(args: Array<String>) {
     var list= listOf(4,17,45,8,46,99,76,44,32)
    val evenList=list.filter { (it%2)==0 }
    evenList.forEach { println(it) }
}