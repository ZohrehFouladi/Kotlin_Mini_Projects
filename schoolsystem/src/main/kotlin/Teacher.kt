class Teacher(
    name: String,
    family: String,
    employeeId: Int,
    var expriment: Int
) :
    Employee(
        name,
        family,
        employeeId
    ) {


    override fun status() {
        super.status()
        println("she is a teacher with $expriment years expriments")
    }



}
