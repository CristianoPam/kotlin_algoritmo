fun main(args: Array<String>) {
    

    //variável mutável
    var nome = "João"
    nome="Cristiano Pereira Alves"
    var profissao = "Tecnico em Informática"
    var idade = 35
    //variável imutável
    val anoNascimento = 1988



    println("$nome tem $idade anos de idade e trabalha como $profissao.")
    println(nome + "tem " + idade + " anos de idade e trabalha como " + profissao)


    /*
        String - Textos
        byte - Números Inteiros (-128 até 127)
        int - Números Inteiros (-2147483648 até 2147483647)
        Long - Números Inteiros (-9223372036854775808 até 9223372036854775807)
        float - Números Decimais (1.1234567 até 7 casas decimais)
        double - Números Decimais (1.123456789 até 15 casas decimais)
        boolean - Valores Booleanos (Estados) - true ou false

        Operadores Aritméticos
        + Operador de Soma
        - Operador de Subtração
        / Operador de Divisão
        * Operador de Multiplicação
        % Módulo - Resto da Divisão
        ++ Incremento
        -- Decremento


        Operadores Relacionais

        == Operador de Igual
        < Operador de Menor
        > Operador de Maior
        <= Operador Menor ou lgual
        >= Operador Maior ou Igual
        != Operador de Diferente

        Operadores Lógicos
        && e
        || ou
        
    */
    // no Kotlin não precisa definir o tipo da variável 

    if(true) {println("Olá Mundo!")} else {println("Fim")}

}