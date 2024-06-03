import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        String nome;
        int idade;

        Scanner leia = new Scanner(System.in);

        System.out.print("Qual é seu nome ? ");
        nome = leia.next();

        System.out.print("Qual sua idade ? ");
        idade = leia.nextInt();

        if (idade >= 16) {
            System.out.println(nome+"  é apto a Votar");

        } else if (idade < 16) {

            System.out.println(nome+ " não é apto a Votar");
        }
    }

}
