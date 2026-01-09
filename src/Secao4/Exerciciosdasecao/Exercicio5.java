package Secao4.Exerciciosdasecao;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int numero = leitor.nextInt();

        if(numero >= 10 && numero <= 20){
            System.out.println("O numero " + numero + " está dentro do intervalo de 10 e 20");
        } else {
            System.out.println("O numero " + numero + " está fora do intervalo de 10 e 20");
        }

        leitor.close();
    }

}
