import java.util.Scanner
fun main(){
    while(true){
        print("Введите количество баллов за тест: ")
        val number = Scanner(System.`in`).nextInt()
        if(70 <= number && number <= 100){
            println("Поздравляю, ты справился с тестом!")
            break
        }
        if(number < 70 && number > 0){
            println("Извини, ты провалил тест")
            break
        }
        else{
            println("Введено некорректное значение")
        }
    }
}
