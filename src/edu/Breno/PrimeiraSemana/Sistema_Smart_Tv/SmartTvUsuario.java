package edu.Breno.PrimeiraSemana.Sistema_Smart_Tv;

public class SmartTvUsuario {
    public static void main (String [] args) throws Exception{

        SmartTV SmartTV = new SmartTV();

        //Estado Padrão: false
        //Volume Padrão: 25
        //Canal Padrão: 1

        System.out.print("A TV Está ");
        System.out.println(SmartTV.Estado == true ?"Ligada" : "Desligada");
        System.out.println("Volume " + SmartTV.volume);
        System.out.println("Canal " + SmartTV.canal);
        System.out.println("");

        SmartTV.ConfigurarEstado("Ligar"); //Estado : true
        SmartTV.ConfigurarVolume("Aumentar");//Volume : 26
        SmartTV.AlterarCanal(12); //Canal : 12


        System.out.print("A TV Está ");
        System.out.println(SmartTV.Estado == true ?"Ligada" : "Desligada");
        System.out.println("Volume " + SmartTV.volume);
        System.out.println("Canal " + SmartTV.canal);
        System.out.println("");


       
    }
}
