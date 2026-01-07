package Secao4;

public class OperadoresLogicos {
    public static void main(String[] args) {
        
    //     //NÂO lófico "!"
    //     if(!false){
    //         System.out.println("Exemplo de uso do NÃO LÓGICO");
    //     }

    //     //E lógico "&&"
    //     if(1 == 1 && 2 == 2){
    //         System.out.println("exemplo de uso do E LÓGICO");
    //     }

    //     //OU lógico "||"
    //     int i = 10;
    //     int f = 11;
    //     if(i == 10 || f == 21){
    //        System.out.println("Exemplo de uso do OU LÓGICO"); 
    //     }
    // 

        int idade = 15;
        boolean temcarteiraDeMotorista = true;

        System.out.println(idade >= 18 && temcarteiraDeMotorista);
        System.out.println(idade >= 18 && temcarteiraDeMotorista == true);
    }

}
