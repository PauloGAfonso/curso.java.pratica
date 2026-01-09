package Secao4.Exerciciosdasecao;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite uma letra: ");

        //Para ignorar as caixas altas e o não atrapalhar o código podemos usar o equalsIgnoreCase ou toLowerCase
        // e para ignorar os demais e focar apenas na primeira letra caso o usuário acabe teclando mais de uma letra sem querer podemos usar
        //chatAt(0), o zero indica a posição do caractere que deve ser levado em consideração
        //porém ele não funciona numa variável tipo String sómente tipo char        
        char letra = leitor.nextLine().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letra + " é vogal");
                break;
            default:
                System.out.println( letra + " é Consoante");
                break;
        }

        leitor.close();
    }
    
}
