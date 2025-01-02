package edu.Breno.PrimeiraSemana;

public class Operadores {
    public static void main (String [] args){
        //Operadores básicos.
        // (+) soma
        System.out.println(1+1);

        //(++) Incremento de +1
        //(-) subtração
        System.out.println(1-1);

        //(--) subtração de -1
        //(/) divisão
        System.out.println(1/1);

        //(*) multiplicação
        System.out.println(1*1);

        //(!) Negação
        boolean Verdadeiro = true;
        System.out.println(!Verdadeiro);

        //(!=) Diferente
        boolean Sim = true;
        boolean Nao = false;
        if (Sim != Nao){
            System.out.println("é Diferente");
        } else {
            System.out.println("é Igual");
        }

        //(?:) Operador ternário
        String a = "aa";
        String b = "bb";
        String resultado = a==b ? "Verdadeiro" : "Falso";
        System.out.println(resultado);

        //Operadores de Soma podem ser atribuidos a Strings
        //EX:
        String Nome = "Breno";
        String Sobrenome = "Brito";
        String NomeCompleto = Nome+" "+Sobrenome;
        System.out.println(NomeCompleto); //Saida: Breno Brito

        //(=) Atribuição de Valor
        //(==) Comparação de Valor
        System.out.println(a==b);
        //(==) Para Objetos usamos o .equals
        String NomeObjeto = new String("Brito");
        System.out.println(Nome.equals(NomeObjeto));

        //(&&) Para prosseguir as buas condições precisam ser verdadeiras
        int um = 1;
        int dois = 2;
        if (um+dois == 3 && dois-um == 1){
            System.out.println("O Operador && Funcionou");
        }
        //(||) Para prosseguir uma das buas condições precisam ser verdadeiras
        if (um+dois == 3 || dois-um == 0){
            System.out.println("O Operador || Funcionou");
        }

    }
}
