fun main(args: Array<String>) {
    println("Hello World!")
println(addNumbers(4,5))
    sumFun(6,7).invoke()

    println(validateMobile("093809601857").invoke())
}



val addNumbers = {num1:Int,num2:Int -> (num1+num2)}
val sumFun={num1:Int,num2:Int -> {
    println("hi")
    println(num1+num2)
    num1*num2
}}
val validateMobile={phone:String-> {
    if((!phone.startsWith("09"))||(phone.length!=11))
         "the phone number is invalid"
    else
        "the phone number is valid"
}

}