package Secao2;

import java.util.Scanner;

public class ProblemasNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();
         
        // Consumindo o /n para absorver o enter clicado após colocar o número
        scanner.nextLine();

        System.out.println("Digite um texto: ");
        String txt = scanner.nextLine();

       

        System.out.println("Os dados são n = " + n + " e txt = " + txt);

        scanner.close();
    }

}
