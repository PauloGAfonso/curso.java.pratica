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
        char umaUnicaLetra = 'a';
        String testando = "Hello, World";
        String outroTeste = testando;

        System.out.println(outroTeste); //Devido a vc ter associado a variável 'testando' a variável 'outroTeste', tudo que estiver na variável testando mudará na variável outroeste
        
    }
}
