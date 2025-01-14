package edu.Breno.SegundaSemana.BancoDigital;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Conta cliente = new Conta("Pedro", "12345-6", "1234");
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        while (loop) {
            System.out.println("""
            
            [============================================]
                            Banco Java
                        Escolha uma opção

                    [0] Exibir informações
                    [1] Sacar 
                    [2] Depositar
                    [3] Sair


            [============================================]
            """);
            int seletor = scanner.nextInt();

            switch (seletor) {
                case 0:
                    cliente.ExibiInformacoes();
                    break; 
                case 1:
                    System.out.println("Digite o valor de saque:");
                    double valorSaque = scanner.nextDouble();
                    cliente.Sacar(valorSaque);
                    break;

                case 2:
                    System.out.println("Digite o valor de depósito:");
                    double valorDeposito = scanner.nextDouble();
                    cliente.Depositar(valorDeposito);
                    break; 

                case 3:
                    loop = false;
                    System.out.println("Obrigado por usar o Banco Java!");
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }

        scanner.close(); 
    }
}
