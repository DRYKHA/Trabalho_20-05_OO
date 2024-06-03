import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

    int nota1,
    nota2,
    nota3,
    media = 0;

    Scanner leia = new Scanner(System.in);

        System.out.println("Informe sua  primeira nota: ");
        nota1 = leia.nextInt();

        System.out.println("Informe sua segunda nota: ");
        nota2 = leia.nextInt();

        System.out.println("Informe sua terceira nota: ");
        nota3 = leia.nextInt();

        media = (nota1+nota2+nota3)/3;

            if(media >= 7){
        System.out.println("Aprovado");
            } else if (media < 7 && media >= 5) {
        System.out.println("Em exame");
            }else{
        System.out.println("Reprovado");
    }
}

}