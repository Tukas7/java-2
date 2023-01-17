import java.util.Scanner
fun main(){
    print("Введите число: ")
    var a = 0
    var number = Scanner(System.`in`).nextInt()

    for(i in 0..number ){
            a += i
    }
    println("Сумма всех чисел от 0 до $number = $a")
}