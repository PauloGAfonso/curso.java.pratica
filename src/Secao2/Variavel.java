package Secao2;

public class Variavel {
    public static void main(String[] args) {
        //1 - O que são variaveis
        // tipo -> nome -> atribuir um valor;
        String nome = "Paulo";
        System.out.println(nome);

        int idade = 26;
        System.out.println(idade);

        //Tipos de dados
        Boolean CondicionaisLogicas = false;
        byte ManipulacaoBinaria = 0;
        int numerosInteiros = 0;
        long inteirosGrandes = 0;
        float flutuanteOuFracionais = 1.5f;
        double flutantesOuFracionaisMaiores = 1.5d;
        char umaUnicaLetra = 'a'; // -> utilizando aspas únicas é char.
        
        
        // Atribuição de variável com outra
        String testando = "Hello, World"; //-> utilizando aspas duplas é string.
        String outroTeste = testando;
        
        
        /*
        Devido a vc ter associado a variável 'testando' a variável 'outroTeste', tudo que estiver na variável testando mudará na variável outroeste
        */
        System.out.println(outroTeste); 


        // Comentários de uma linha

        /*
            Comentário usado para explicação mais longas
         */


        /**
         * Comentários
         * para
         * documentação
         */

            // testando - Ctrl + K, Ctrl + C vc transforma a linha ou linhas selecionada(s) em comentário no vscode.


        // - STRINGS

        String firstName = "Paulo";
        String LastName = "Afonso";

        // System.out.println(firstName + " " + LastName);

        String fullName = firstName + " " + LastName;

        System.out.println(fullName);




    }
}
