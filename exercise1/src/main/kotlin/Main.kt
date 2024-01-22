fun main(args: Array<String>) {
    var negative = false
    val list = mutableListOf<String>()
    var fIndex: Int = 0
    val p = arrayOf("2", "1", "4", "7", "4", "8", "3", "6", "4", "8")
    val q = arrayOf("2", "1", "4", "7", "4", "8", "3", "6", "4", "7")

    println("Enter a signed number")
    val str: String = readln()
    var l = str.lastIndex

    if (str[0] == '-') {
        list.add("-")
        negative = true
        fIndex = 1
    }
    while ((str[l] == '0') && (l > 0)) {
        l--
    }

    if (negative)
        for (i in l downTo 1)
            list.add(str[i].toString())
    else
        for (i in l downTo 0)
            list.add(str[i].toString())


    for (i in 0..l) {
        print(list[i])
    }

    val l2Length = list.count()

    if (l2Length > 10 + fIndex)
        println("not integer")
    else {
        if ((l2Length == 11) && (negative)) {
            var i = 0
            while (i < 11) {

                if (list[i + fIndex].toInt() > p[i].toInt()) {
                    println("not integer")
                    break
                }
                if (list[i + fIndex].toInt() == p[i].toInt())
                    i++
            }
        }
        if ((l2Length == 10) && (!negative)) {
            var i = 0
            while (i < 10) {

                if (list[i].toInt() > q[i].toInt()) {
                    println("not integer")
                    break
                }
                if (list[i].toInt() == q[i].toInt())
                    i++
            }

        }


    }


}











