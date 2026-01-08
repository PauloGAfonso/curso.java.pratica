package Secao4.Exerciciosdasecao;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira o nome de usuario cadastrado: ");
        String usuario = leitor.nextLine();

        System.out.print("Insira a senha: ");
        String senha = leitor.nextLine();

        if(usuario.equals("admin") && senha.equals("1234")){
            System.out.println("Acesso permitido!!!");
        } else {
            System.out.println("Acesso negado!!!");
        }

        leitor.close();

    }
}
