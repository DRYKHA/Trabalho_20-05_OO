import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        int num1,
        num2;

        Scanner leia = new Scanner(System.in);

        System.out.print("Insira o primeiro número ");
        num1 = leia.nextInt();

        System.out.print("Insira o segundo número ");
        num2 = leia.nextInt();

        if(num1 > num2) {
            System.out.println(num1+" é maior");

        } else if (num1 < num2) {

            System.out.println(num2 +" é maior");

        } else {

            System.out.println("Os dois números são iguais");
        }

    }

}
