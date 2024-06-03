import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

      int hsalarioPorHora,
       horasTrabalhadas,
       salario;

        Scanner leia = new Scanner(System.in);


        System.out.print("Quanto você recebe por hora ?: ");
            hsalarioPorHora =  leia.nextInt();

        System.out.print("Quantas horas você trabalhou no mês ? : ");
            horasTrabalhadas = leia.nextInt();

        salario = hsalarioPorHora * horasTrabalhadas;

        System.out.println("Seu Salário será de R$ "+ salario);

    }
}


