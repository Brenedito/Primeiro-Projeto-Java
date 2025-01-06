package edu.Breno.SegundaSemana.ContaBancária;
import java.util.Scanner;

public class ContaTerminal {
    //Criação das variavleis
    int NUMERO;
    String AGENCIA;
    String nome; 
    float saldo = 0;

    public static void main(String [] args) {

        ContaTerminal conta = new ContaTerminal();
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o Número da conta?");
        conta.NUMERO = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o Agencia da conta?");
        conta.AGENCIA = scanner.nextLine();

        System.out.println("Qual o Nome da conta?");
        conta.nome = scanner.nextLine();
        scanner.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.%n", conta.nome, conta.AGENCIA, conta.NUMERO, conta.saldo);

        
    }


}