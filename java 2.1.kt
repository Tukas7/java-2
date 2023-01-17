import java.util.Scanner
fun main() {
    while (true){
        print("Введите слово или предложение: ")
        val word = readLine()
        if ( word == "Exit" || word == "exit")
            break
    }
}