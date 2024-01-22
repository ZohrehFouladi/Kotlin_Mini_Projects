fun main() {
    val generic=Generic<Int>()
    generic.add(6)
    generic.add(4)
    generic.add(2)
    generic.add(9)
    generic.show()

val kv=KeyValue<Int,String>()
    kv.add(1,"Ali")
    kv.add(2,"maryam")
    kv.add(3,"zoya")
    kv.showAll()
}