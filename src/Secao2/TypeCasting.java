package Secao2;

public class TypeCasting {

    public static void main(String[] args) {
         // Type Casting

        // implicito(widening)
        int numero2 = 42;

        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        //explicito (Narrowing)
        double valorDouble = 9.78;

        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        // casting de char para int

        char letra2 = 'A';

        int codigoAscii = (int) letra2;

        System.out.println(codigoAscii);

        //prática própria

        double numeroTeste = 62.52;

        long novoNumeroTeste = (long) numeroTeste;

        System.out.println(novoNumeroTeste);


    }
}
