/* 
1.Encontre o maior número em uma lista: Escreva um algoritmo para encontrar o maior número em uma lista de valores.
2.Verifique se um número é primo: Crie um programa que determine se um número é primo ou não.
3.Inverta uma string: Desenvolva um algoritmo que inverta uma string fornecida como entrada.
4.Calcule o fatorial de um número: Escreva um programa que calcule o fatorial de um número dado.
5.Ordenação de lista: Implemente um algoritmo de ordenação para ordenar uma lista de valores.
6.Verifique se uma palavra é um palíndromo: Crie um programa que identifique se uma palavra é um palíndromo.
7.Verifique se dois conjuntos são iguais: Desenvolva um algoritmo para verificar se dois conjuntos possuem os mesmos elementos.
8.Encontre o número que falta: Dada uma sequência de números de 1 a N, encontre o número que está faltando.
9.Encontre o menor número em uma lista: Escreva um programa para encontrar o menor número em uma lista de valores.
10.Converta um número decimal para binário: Implemente um algoritmo que converta um número decimal para seu equivalente em binário.

*/

//1. exercice
fun encontrarMaiorNumero(lista: List<Int>): Int {
    if (lista.isEmpty()) {
        print("A lista não pode estar vazia")
    }

    var maior = lista[0]
    for (numero in lista) {
        if (numero > maior) {
            maior = numero
        }
    }
    return maior
}

//2. exercice
fun verificarPrimo(numero: Int): Boolean {
    if (numero <= 1) {
        return false
    }
    for (i in 2 until numero) {
        if (numero % i == 0) {
            return false
        }
    }
    return true
}

//3. exercice
fun inverterString(str: String): String {
    val caracteres = str.toCharArray()
    var inicio = 0
    var fim = caracteres.size - 1

    while (inicio < fim) {
        val temp = caracteres[inicio]
        caracteres[inicio] = caracteres[fim]
        caracteres[fim] = temp
        inicio++
        fim--
    }

    return String(caracteres)
}

//4. exercice
fun calcularFatorial(numero: Int): Long {
    if (numero < 0) {
        println("Não é possível calcular o fatorial de um número negativo.")
    }
    
    var resultado: Long = 1
    for (i in 1..numero) {
        resultado *= i.toLong()
    }
    
    return resultado
}

//5. exercice

fun bubbleSort(array: MutableList<Int>): List<Int> {
    val lengthOfArray = array.size
    for (i in 0 until lengthOfArray - 1) {
        for (j in 0 until lengthOfArray - i - 1) {
            if (array[j] > array[j + 1]) {
                // Troca usando uma variável temporária
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}






fun main() {

//1. exercice

    val numeros = listOf(10, 5, 23, 8, 15)
    val maiorNumero = encontrarMaiorNumero(numeros)
    println("O maior número na lista é: $maiorNumero")

//2. exercice

val numero = 17
if (verificarPrimo(numero)) {
    println("$numero é um número primo.")
} else {
    println("$numero não é um número primo.")
}

//3. exercice

val stringOriginal = "Cristiano"
    val stringInvertida = inverterString(stringOriginal)
    println("String original: $stringOriginal")
    println("String invertida: $stringInvertida")

//4. exercice
    val numero2 = 5
    val fatorial = calcularFatorial(numero2)
    println("O fatorial de $numero é: $fatorial")

//5. exercice

val listaNumeros  = intArrayOf(34, -5, 42, 18, 0, -12, 59, 3);
//utilizando a função BubbleSort para ordenar o array listaOrdenada
val listaOrdenada = bubbleSort(listaNumeros.toMutableList());
println("Lista ordenada: $listaOrdenada");

//6. exercice

val palavra = "bbaabb" // Palavra a ser verificada
var ehPalindromo = true

// Verifica se a palavra é um palíndromo
for (i in 0 until palavra.length / 2) {
    if (palavra[i] != palavra[palavra.length - i - 1]) {
        ehPalindromo = false
        break
    }
}

// Exibe o resultado
if (ehPalindromo)
    println("$palavra é um palíndromo.")
else
    println("$palavra não é um palíndromo.")

// 7. exercice

fun main() {
    val conjuntoA  = intArrayOf(34, -5, 42, 18, 0, -12, 59, 3);
    val conjuntoB  = intArrayOf(34, -5, 42, 18, 0, -12, 59, 3);
    var i=conjuntoA.size-1
    var conjuntoiguais=true
    
    
    
    while ( i >=0  ) {
    
        if (conjuntoA[i]  == conjuntoB[i]){
        i--
        } else{ 
            conjuntoiguais=false; i=-1}   
    
    } 
    
    if(conjuntoiguais==true){
        println("Conjunto são iguais")
    
    } else{ println("Conjuntos são diferentes")}
    
    }

// 8. exercice  ++8.Encontre o número que falta: Dada uma sequência de números de 1 a N, encontre o número que está faltando.


val list = intArrayOf(1,2,3,4,5,7,8,9,10)
var ii=1


while(ii <= list.size-1 ){

if (ii==1){println(list[ii-1].toString())} 

if(list[ii]-list[ii-1]==1){

    println(list[ii].toString())        

} 
else {
    println("-->> A sequencia  está faltando o número: ${list[ii]-1}")
}

ii++

}

//  9.Encontre o menor número em uma lista: Escreva um programa para encontrar o menor número em uma lista de valores.


val listmenor = intArrayOf(15,35,7,-2,4,33,3,4)
var ee=0
var mn=listmenor[0]+1


while (ee < listmenor.size){
println("numero: ${listmenor[ee].toString()}")

if(listmenor[ee] < mn){
   mn = listmenor[ee].toInt()
} else {
   mn = mn 
}
    ee++
}

println("O maior valor da lista é: ${mn}")

// 10.Converta um número decimal para binário: Implemente um algoritmo que converta um número decimal para seu equivalente em binário.


var num = 20
  var quociente = 0
  val binario = arrayListOf<Int>()
  val resultado = arrayListOf<Int>()
  

  while (quociente != 1) {
    var q = num/2
    var resto = num%2
    
    quociente=q
    num=q
    binario.add(resto)
  }
  
  binario.add(quociente)

  //println(binario.toString())  
  //invertendo os valores

  var i=binario.size-1

  while(i >= 0){
    
    resultado.add(binario[i])

    i--
  }

  println(resultado.toString())





}