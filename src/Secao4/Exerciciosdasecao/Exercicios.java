package Secao4.Exerciciosdasecao;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o valor do produto: ");
        Double valor = leitor.nextDouble();

        if (valor < 50) {
            System.out.println("Esse produto é barato");
        } else if(valor >= 50 && valor <= 100) {
            System.out.println("Esse valor esta na média");
        } else {
            System.out.println("Esse produto é caro");
        }

        leitor.close();
    }

}
