
    class Student1(name: String, family: String, var studentId: Int) : Person(name, family) {
        override fun status() {
            super.status()
            println("she is a student with the student ID=$studentId")
        }
        constructor(studentId: Int) : this("", "", studentId) {


        }
    }
