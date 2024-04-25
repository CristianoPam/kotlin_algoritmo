

import java.util.Arrays
/*Converta um número decimal para binário */

fun main() {
  
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
  
