package Secao2;

import java.util.*;

public class EntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Olá, " + nome + " Muito prazer");
    }

}
