package edu.Breno.SegundaSemana.BancoDigital;

public class Conta extends Cliente {
    double saldo = 0;
    double Limitedeposito=1001;

    Conta(String nome, String conta, String agencia){
        this.nome = nome;
        this.conta = conta;
        this.agencia = agencia;
    }

    public void ExibiInformacoes(){
        System.out.println(nome);
        System.out.println(conta);
        System.out.println(agencia);
        System.out.println(saldo);
    }

    public void Depositar(double ValorDeDeposito){
        if (ValorDeDeposito > Limitedeposito){
            System.out.println("Valor execede o deposito máximo");
        } else if(ValorDeDeposito <= 0) {
            System.out.println("Você não pode depositar 0 ou numeros negativos.");
        } else {
            saldo += ValorDeDeposito;
            System.out.println("Deposito Realizado!");
        }
    }


    public void Sacar(double ValorDeSaque){
        if (ValorDeSaque > saldo){
            System.out.println("Saldo insuficiente");
        } else if(ValorDeSaque <= 0){
            System.out.println("Você não pode sacar 0 ou numeros negativos.");
        } else{
            saldo -= ValorDeSaque;
            System.out.println("Saque realizado com sucesso, R$"+saldo+" restantes na conta.");
        }
    }


}
