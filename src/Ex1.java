import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        int numero;

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número inteiro:");
        numero = leia.nextInt();

        System.out.println("O Sucessor de " + numero + " é " + (numero + 1));
        System.out.println("O Antecessor de " + numero + " é " + (numero - 1));


    }
}
