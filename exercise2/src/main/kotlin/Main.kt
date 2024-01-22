fun main(args: Array<String>) {
    println("write a sentence")
    val str = readln()
    var r: Int = str.lastIndex
    var word = ""


    while (r >= 0 && str[r] == ' ') {
        r--
    }
    var l=r

    while (l>= 0 && str[l] != ' '){
        l--
    }
     for (i in l..r){
         word+=str[i]
     }
    println("The last word of this sentence is ${word} and its length is${r-l}")
}