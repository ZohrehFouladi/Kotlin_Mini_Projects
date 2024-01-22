class Generic<T> {
    private val sampleList=mutableListOf<T>()
     fun add(input:T){
        sampleList.add(input)
    }
     fun show(){
        println(sampleList)
    }

}