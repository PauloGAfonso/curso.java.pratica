package Secao3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero que vc deseja ver a tabuada: ");
        int numero = leitor.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " * " + i + " = " + numero*i);
        }

        leitor.close();
    }
}
