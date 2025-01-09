package edu.Breno.SegundaSemana.DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Primeiro número: ");
        int Numero1 = scan.nextInt();
        System.out.println("Digite o Segundo número: ");
        int Numero2 = scan.nextInt();
        scan.close();
        int  Contador = 0;

        try{
           Contador = Conta(Numero1,Numero2);
           for(int i = 1; i <= Contador+0;i++){
            System.out.println("Imprimindo o número "+i);
        }
        } catch(ParametrosInvalidosException e){
            System.out.println("Mensagem de Erro: "+ e.getMessage());
        }

    }
    public static int Conta(int Numero1, int Numero2) throws ParametrosInvalidosException{
        int Resultado = Numero1 - Numero2;
        if(Resultado <= 0){
            throw new ParametrosInvalidosException("o primeiro número deve ser maior que o segundo");
        }
        return Resultado;
    }
}



