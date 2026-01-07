package Secao4;

import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        

        // leitor.close();


        // IF
        // int numero = 10;

        // if(numero == 10){
        //     System.out.println("PARABENS APRENDEU A USAR O IF, SEU MACACO");
        // }

        // //Se a retorna boolean (False ou TRUE) eu posso usar no if
        // String texto = "java";

        // if(texto.equals("java")){
        //     System.out.println("Usando if com resultado boolean");
        // }


        //ELSE
        // Boolean booleano = false;

        // if(booleano) {
        //     System.out.println("A variável está em True então o if foi executado!");
        // } else {
        //     System.out.println("A variável está em false então o else foi executado");
        // }

        //ELSE IF
        System.out.print("Qual é sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 20) {
            System.out.println("Você é adulto");
            System.out.println("Rodou o if");
        } else if(idade > 12 && idade < 20) {
            System.out.println("Você é um adolescente");
            System.out.println("Rodou o else if");
        } else {
            System.out.println("Você é uma criança");
            System.out.println("Rodou o else");
        }


        leitor.close();
    }
}
