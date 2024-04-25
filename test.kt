fun main() {

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



}