import java.util.*
fun main(){
    val chen: Array<String> = arrayOf(" ","news", "travel", "serials", "nature", "music","radio", "exit")
    println("""enter the channel:
        1)news
        2)travel
        3)serials
        4)nature
        5)music
        6)radio
        0)exit
    """)
    var str: Int = Scanner(System.`in`).nextInt()
    while (str != 0){
        var channel = chen[str]
        println("now you watching $channel")
        println("enter next channel or exit")
        str = Scanner(System.`in`).nextInt()
    }
}