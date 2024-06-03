import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

        int idadeDoacao;

     Scanner leia = new Scanner(System.in);

     System.out.print("Qual é a sua Idade? : ");
            idadeDoacao = leia.nextInt();

        if (idadeDoacao >= 18 && idadeDoacao <= 67) {
     System.out.println("Você pode doar sangue");

        } else {
     System.out.println("Você não pode doar sangue");
    }
}

}
