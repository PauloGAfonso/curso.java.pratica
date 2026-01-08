package Secao4;

import java.util.*;

public class TrabalhandocomSwitch {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Que dia é hoje? ");
        int diadasemana = leitor.nextInt();

        switch(diadasemana){
            
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("sabado-Feira");
                break;
            default:
                System.out.println("Esse dia não existe, brother");
        }

        //Switch sem break, irá executar tudo de uma vez

        switch (1) {
            case 1:
                System.out.println("Executou 1");
            case 2:
                System.out.println("Executou 2");
            case 3:
                System.out.println("Executou 3");
            default:
                System.out.println("Executou 4");
        }

        
        leitor.close();
    }
    
}
