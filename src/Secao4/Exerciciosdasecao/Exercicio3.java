package Secao4.Exerciciosdasecao;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int numero = leitor.nextInt();

        if(numero%2==0){
            System.out.println("Esse numero é par");
        } else {
            System.out.println("Esse numero é impar");
        }

        leitor.close();
    }

}
