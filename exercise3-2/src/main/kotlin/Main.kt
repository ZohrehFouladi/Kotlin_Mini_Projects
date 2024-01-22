fun main() {
    val array = intArrayOf(9,1,1)
    var result=solve(array)
    val expected= intArrayOf(9,1,2)
    for (i in expected.indices)
        if (result[i]!=expected[i]){
            println("Incorrect in index $i : expected:${expected[i]} but get ${result[i]} ")
            break}


}
fun solve(array: IntArray): IntArray {
    val size = array.size
    var i= size-1
    while ((array[i]==9)&&(i!=0)){
       array[i]=0
        i--
    }
    array[i] += 1
    return array
}