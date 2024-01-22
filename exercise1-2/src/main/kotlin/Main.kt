fun main(args: Array<String>) {
    println("Enter a signed number")
    var a: String = readln()
    var b: Long
    var negative = true

    if (a.startsWith("-")) {
        a = a.replace("-", " ")
        a = a.trim()
        negative = false
    }
    a = a.reversed()
    if (a.startsWith("0")) {
        a = a.replace("0", " ")
        a = a.trim()
    }
    b = a.toLong()
    if ((b < -2147483648) or (b > 2147483647)) {
        println("0")
    } else {
        if (negative==false){
            b=b*(-1)
        }
        println(a)

    }
}








