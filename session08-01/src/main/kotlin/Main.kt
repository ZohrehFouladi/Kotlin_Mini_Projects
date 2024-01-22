import java.lang.NullPointerException
import java.util.Date
import java.util.concurrent.TimeUnit

fun main(args: Array<String>) {
    val firstCamera = mutableMapOf<String, Date>()
    val minPenaltyTime = 24
    val normalPenaltyTime = 30

    while (true) {
        try {
            val menu = menu()
            when (menu) {
                1 -> camera1shot(firstCamera)
                2 -> camera2shot(firstCamera, normalPenaltyTime, minPenaltyTime)
                0 -> {
                    println("finish")
                    return
                }

            }
        }catch(e:Exception){
            println("exception=${e.message}")
        }
    }
}

private fun camera2shot(
    firstCamera: MutableMap<String, Date>,
    normalPenaltyTime: Int,
    minPenaltyTime: Int
) {
    println("first camera:enter the ID please")
    val cam2id = readln()!!
    var filter = firstCamera.filter { it.key.lowercase() == cam2id.lowercase() }
    if (filter.isNotEmpty()) {
        val endDate = Date()
        val startDate=firstCamera[cam2id]
        val diff=timeDiff(startDate!!,endDate)
        if (diff < normalPenaltyTime)
            if (diff < minPenaltyTime) {
                println("Your fine is 200$")
            } else {
                println("Your fine is 150$")
            }
    }
}
fun timeDiff(startDate: Date,endDate: Date):Long{
    val timeDifference = endDate.time - endDate.time
    val diff = TimeUnit.MILLISECONDS.toSeconds(timeDifference)
    return diff
}
private fun camera1shot(firstCamera: MutableMap<String, Date>) {
    println("first camera:enter the ID please")
    val cam1Id = readln()!!
    val cam1Date = Date()
    firstCamera[cam1Id] = cam1Date
}

private fun menu(): Int {
    println("menu: choose[1] or [2] or [0]")
    val menu = readln()?.toInt()!!
    return menu
}