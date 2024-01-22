fun main(args: Array<String>) {

    helloFunction("sara",greeting)
    helloFunction("Ali",completeGreet)

}

fun helloFunction(name :String, callBack:(String)->Unit)
{
    callBack(name)
}

val greeting = { name: String -> println("hello $name") }
val completeGreet = { name: String -> println("hello $name haw are you?") }