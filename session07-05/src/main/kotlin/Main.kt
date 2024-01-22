fun main(args: Array<String>) {

    println(mul(1,6,3,2))
}
fun mul(vararg numbers: Int):Int{
    var multiply=1
    numbers.forEach {multiply*=it }
    return multiply
}