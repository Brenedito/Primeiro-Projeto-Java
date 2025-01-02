package edu.Breno.PrimeiraSemana.Sistema_Smart_Tv;

public class SmartTV {
    boolean Estado = false;
    int canal = 1;
    int volume = 25;

    public void ConfigurarVolume(String Acao){
        if(Estado != false){
            if (Acao.equals("Aumentar")){
                if(volume >= 100){

                }
                volume++;

            } else {
                if(volume <= 0){

                }
                volume--;

            }
        }
    }

    public void ConfigurarEstado(String Acao){
        if(Acao.equals("Ligar")){
            Estado = true;
        } else if (Acao.equals("desligar")) {
            Estado = false;
        } {

        }
    }

    public void AlterarCanal(int Canal){
        canal = Canal;
    }
}
