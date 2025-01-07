package edu.Breno.SegundaSemana;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        //IF Simples
            int numeroAleatorio = 47;
            if(numeroAleatorio == 47){
                System.out.println("O Numero é 47");
            }
        //IF Composto
            if(numeroAleatorio < 50 && numeroAleatorio > 40){
                System.out.println("O Numero é:"+numeroAleatorio);
            }
        //Switch case
        String Letra = "T";
        switch (Letra) {
            case "M":
                System.out.println(Letra);
                break;
            case "C":
                System.out.println(Letra);  
                break;
            case "T":
                System.out.println(Letra);
            break;
            default:
                break;
        }



    }
}
