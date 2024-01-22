open class Employee(
    name: String,
    family: String,
    var employeeId: Int
) :
    Person(name, family) {
    constructor(employeeId: Int) : this("", "", employeeId) {


    }

    override fun status() {
        super.status()
        println("she is an employee with the employeeID=$employeeId")
    }

}
