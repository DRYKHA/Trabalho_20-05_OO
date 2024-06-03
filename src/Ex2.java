import java.util.Scanner;

public class Ex2 {

        public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);

            int km,
            combustível,
             media;

            System.out.print("Digite a distância feita pelo carro em Quilometros ");
            km = leia.nextInt();

            System.out.print("Informe o total de gasolina consumido em litros ");
            combustível = leia.nextInt();

            media = km/ combustível;

            System.out.println("A média de consumo de seu carro foi de "+media+ " km p/ litro");

        }



}
