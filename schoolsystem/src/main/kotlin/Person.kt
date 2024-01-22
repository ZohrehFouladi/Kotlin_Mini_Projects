open class Person(
    var name: String,
    var family: String
) {
    init {

    }

    val password = "123456"
    val data1 = "these are private data"
    open  protected val data: String
        get() {
            println("please enter the password")
            return "$name+$family:$data1"
        }



    open protected var newData: String = "these are the private information"
        protected get
        set(value) {

            field = value + data1
        }


    open fun status() {
        println("there is a person with the name=$name$family")
    }

}

