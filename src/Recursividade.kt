import java.util.*

fun main (args: Array<String>) {

    val teclado = Scanner(System.`in`)

    fun regressiva(numero: Int): Int  {
        if (numero == 0) {
            return 0
        } else {
            println(numero)
            return regressiva(numero-1)
        }
    }

    println("Digite um numero: ")
    regressiva(teclado.nextInt())
}