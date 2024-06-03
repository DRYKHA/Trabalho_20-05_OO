import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        int ano,
       cigarroDia;
        double preco,
        gasto;

        Scanner leia = new Scanner(System.in);

        System.out.println("Há quantos anos você fuma ?");
        ano = leia.nextInt();

        System.out.println("Quantos cigarros por dia você fuma ?");
        cigarroDia = leia.nextInt();

        System.out.println("Qual o valor de uma carteira de cigarros ?");
        preco = leia.nextDouble();

     gasto = ((cigarroDia * (ano * 365)) / 20) * preco;

        System.out.println("Em " + ano + " anos, você já gastou R$ " + gasto);

    }

}
