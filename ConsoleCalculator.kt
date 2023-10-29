/**
 * Punto de entrada principal del programa.
 */
fun main() {
    //Seleccion de operaaciones aritmeticas
    println("Calculadora de Consola")

    val num1 = getNum("Ingresa el 1er número")
    val num2 = getNum("Ingresa el 2do número")

    menu(num1, num2)
    }

/**
 * Solicita al usuario un número entero y valida la entrada.
 *
 * @param message Mensaje que se mostrará al solicitar el número.
 * @return El número entero ingresado por el usuario.
 */
fun getNum(message: String): Int {
    println(message)
    val num = readln()
    return if (num.toIntOrNull() != null) {
        num.toInt()
    } else {
        println("Por favor, introduce un número válido.")
        getNum(message)
    }
}

/**
 * Muestra un menú de operaciones aritméticas al usuario y realiza la operación seleccionada.
 *
 * @param num1 Primer número para realizar la operación.
 * @param num2 Segundo número para realizar la operación.
 */
fun menu(num1: Int, num2: Int) {
    println("Selecciona una opción:\n1)Suma\n2)Resta\n3)Multiplicación\n4)División")
    val option = readln()
    when (option) {
        "1" -> {
            val result = num1 + num2
            println("$num1 + $num2 = $result")
        }

        "2" -> {
            val result = num1 - num2
            println("$num1 - $num2 = $result")
        }

        "3" -> {
            val result = num1 * num2
            println("$num1 x $num2 = $result")
        }

        "4" -> {
            if (num2 != 0) {
                val result = num1 / num2
                println("$num1 / $num2 = $result")
            } else {
                println("No puedes dividir entre 0.")
            }
        }

        else -> {
            println("Por favor, introduce una opción válida.")
            return menu(num1, num2)
        }
    }
}