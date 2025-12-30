package Secao4;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual é sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 20) {
            System.out.println("Você é adulto");
        } else if(idade > 12 && idade < 20) {
            System.out.println("Você é um adolescente");
        } else {
            System.out.println("Você é uma criança");
        }

        leitor.close();

    }
}
