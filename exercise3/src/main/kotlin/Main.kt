fun main(args: Array<String>) {
    println("enter a number")
    var num:IntArray = readln()
    var a = num


    var i = 1
    while (num / 10 != 0) {
        num = (num / 10)
        i++
    }

    var digits = Array<Int>(i){0}

    var lastIndex = i - 1
    num = a
    i = lastIndex

    do {
        digits[i] = (num % 10)
        num = (num / 10)
        i--

    } while (num != 0)

    digits[lastIndex] = digits[lastIndex] + 1

    for (j in 0..lastIndex)
    {
        print(digits[j].toString())
    }
}
