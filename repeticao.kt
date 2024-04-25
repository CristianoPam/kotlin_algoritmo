fun main() {

    var listaCompras = arrayOf("Feijão","Batata","UvaI","Banana","Carne","Leite","Ovos","Frango");

// estrutura de repeditição (Enquanto) => enquanto for verdadeira será executáda
    var tamanho = listaCompras.size
    var indice = 0

    while (indice < tamanho) {

        println(listaCompras[indice])

        indice++
        //  indice += 1
    }

    println("________________________")
    
            // for (até) o temo IN quer dizer INTERVALO
    for (i in 0..7 ) {

        println(listaCompras[i])

    }

// estrutura do WHEN => funciona como cláusa if else de maneira simplificada
    println("________________________")

    var opcao = 1 
    
    when (opcao) {
        1 -> println("Suco de Laranja!")
        2 -> println("Suco de Uva!")
        3 -> println("Suco de Morango!")
        else -> println("Nenhuma opção foi selecionada!")
    }

    println("________________________")
    // utilizar o when com uma variável
    var valor = 2
    var mensagem = when(valor){
        1 -> "Suco de Laranja"
        2 -> "Suco de Goiaba"
        3 -> "Suco de Acerola"
        else -> "Nenhuma opção foi selecionada"
    }
    println(mensagem)

}