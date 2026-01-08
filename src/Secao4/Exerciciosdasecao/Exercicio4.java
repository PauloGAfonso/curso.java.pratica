package Secao4.Exerciciosdasecao;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um numero correspondente a um dia da semana: ");
        int dia = leitor.nextInt();


        // switch (dia) {
        //     case 1:
        //         System.out.println("Domingo");
        //         System.out.println("Final de semana");
        //         break;
            
        //     case 2:
        //         System.out.println("Segunda-feira");
        //         System.out.println("Dia util");
        //         break;

        //     case 3:
        //         System.out.println("Terça-feira");
        //         System.out.println("Dia util");
        //         break;
            
        //     case 4:
        //         System.out.println("quarta-feira");
        //         System.out.println("Dia util");
        //         break;

        //     case 5:
        //         System.out.println("Quinta-feira");
        //         System.out.println("Dia util");
        //         break;

        //     case 6:
        //         System.out.println("Sexta-feira");
        //         System.out.println("Dia util");
        //         break;

        //     case 7:
        //         System.out.println("Sabado");
        //         System.out.println("Final de semana");
        //         break;

        //     default:
        //         System.out.println("Dia inexistente.");
        //         break;
        // }

        //resposta do professor

        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final desemana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Numero invalido!");
                break;
        }
        leitor.close();
    }

}
