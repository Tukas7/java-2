import java.util.Scanner
fun main(args: Array<String>) {
        var n = ""
        var f = ""
        var y = 0

        while(true){
            println(" 1 Ввести имя ")
            println(" 2 Фамилию ")
            println(" 3 Год рождения ")
            println(" 4 Вывести информацию ")
            println(" 0 Выход ")
            print("Что хотите сделать? ")
            val number = Scanner(System.`in`).nextInt()
            if (number == 1) {
                print(" Введите имя: ")
                var name = readLine()
                n = name.toString()
                println("Вы ввели: $n")
            }
            if (number == 2) {
                print(" Введите Фамилию:  ");
                var fam = readLine()
                f = fam.toString()
                println("Вы ввели: $f")
            }
            if (number == 3) {
                print(" Введите Год рождения:  ");
                val year = Scanner(System.`in`).nextInt()
                y = year
                println("Вы ввели: $y")
            }
            if (number == 4) {
                println("Имя: $n, Фамилия: $f, Год рождения: $y")
            }
            if (number == 0){
                break
            }
        }


}


