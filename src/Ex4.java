import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        String sexo;

        Scanner leia= new Scanner(System.in);


        System.out.print("Insira o seu sexo (M/F): ");
        sexo = leia.next().toUpperCase();

        if (sexo.equals("M")) {
            System.out.println("Você é homem");

        } else if (sexo.equals("F")) {

            System.out.println("Você é mulher ");

        } else {

            System.out.println("Dado incorreto");
        }

    }
}


