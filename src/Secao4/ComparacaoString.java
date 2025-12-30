package Secao4;

public class ComparacaoString {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        //comparando usando == 
        System.out.println("Comparando...");
        System.out.println(str1 == str2);
        System.out.println("Java" == str2);
        System.out.println(str1 == "Java");

        // usando o metodo equals para fazer comparação de string
        System.out.println("Comparando usando o metodo equals");
        System.out.println(str1.equals(str2));


        // usando o equalsignorecase()
        String str3 = "JAVA";

        System.out.println("usando o equalsIgnoreCase()");
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
        

    }

}
