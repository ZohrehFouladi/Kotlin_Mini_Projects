class KeyValue<K,V> {
    private val mutableMap= mutableMapOf<K,V>()
    fun add(input1:K,input2: V){
        mutableMap.put(input1,input2)
    }
    fun showAll(){
        mutableMap.forEach { t, u -> println("$t:$u")  }
    }
}