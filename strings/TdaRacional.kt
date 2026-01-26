//A tarefa aqui neste problema é ler uma expressão matemática na forma de dois números Racionais (numerador / denominador)
// e apresentar o resultado da operação. Cada operando ou operador é separado por um espaço em branco. A sequência de cada linha
// que contém a expressão a ser lida é: número, caractere, número, caractere, número, caractere, número. A resposta deverá ser apresentada e posteriormente 
//simplificada. Deverá então ser apresentado o sinal de igualdade e em seguida a resposta simplificada. No caso de não ser possível uma simplificação, deve ser 
//apresentada a mesma resposta após o sinal de igualdade.
//Considerando N1 e D1 como numerador e denominador da primeira fração, segue a orientação de como deverá ser realizada cada uma das operações:
//Soma: (N1*D2 + N2*D1) / (D1*D2)
//Subtração: (N1*D2 - N2*D1) / (D1*D2)
//Multiplicação: (N1*N2) / (D1*D2)
//Divisão: (N1/D1) / (N2/D2), ou seja (N1*D2)/(N2*D1)
//Entrada
//A entrada contem vários casos de teste. A primeira linha de cada caso de teste contem um inteiro N (1 ≤ N ≤ 1*104), indicando a quantidade de casos de teste que devem ser lidos logo a seguir. Cada caso de teste contém um valor racional X (1 ≤ X ≤ 1000), uma operação (-, +, * ou /) e outro valor racional Y (1 ≤ Y ≤ 1000).
//Saída
//A saída consiste em um valor racional, seguido de um sinal de igualdade e outro valor racional, que é a simplificação do primeiro valor. No caso do primeiro valor não poder ser simplificado, o mesmo deve ser repetido após o sinal de igualdade.

import java.util.*

fun calculadora(op: Char,N1: Int, N2: Int, D1: Int, D2: Int): Pair<Int, Int> {
    return when (op) {
        '+' -> Pair(N1 * D2 + N2 * D1, D1 * D2)
        '-' -> Pair(N1 * D2 - N2 * D1, D1 * D2)
        '*' -> Pair(N1 * N2, D1 * D2)
        '/' -> Pair(N1 * D2, N2 * D1)
        else -> Pair(0,1)
    }

}
fun mdc(a: Int, b: Int): Int {
    return if (b == 0) kotlin.math.abs(a) else mdc(b, a % b)
}

fun simplificar(n: Int, d: Int): Pair<Int, Int> {
    val m = mdc(n, d)
    return Pair(n / m, d / m)
}

fun main(args: Array<String>) {
    
    val cont = readLine()!!.toInt()
    
    for(i in 1..cont) {
    val entrada = readLine()!!.split(" ") // divide pelo espaço, evita de separar > dezena
    val n1 = entrada[0].toInt()
    val d1 = entrada[2].toInt()
    val operacao = entrada[3][0]
    val n2 = entrada[4].toInt()
    val d2 = entrada[6].toInt()

    val (num, den) = calculadora(operacao, n1, n2, d1, d2)
    val (simpNum, simpDen) = simplificar(num, den)
    println("$num/$den = $simpNum/$simpDen")
        
    }
}
