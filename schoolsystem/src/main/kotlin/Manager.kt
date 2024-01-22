
    class Manager(
        name: String,
        family: String,
        employeeId: Int,
        var schoolName: String
    ) :
        Employee(
            name,
            family,
            employeeId
        ) {


        override fun status() {
            super.status()
            println("she is a the of the $schoolName school")
        }


    }
