import java.util.Scanner;

public class gabas{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

System.out.println("Qual você deseja escolher?");
System.out.println("A - Gabi, B - Bia, C - Samara");
String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("A")) {
            System.out.println("Você escolheu Gabi!");
        } else if (resposta.equalsIgnoreCase("B")) {
            System.out.println("Você escolheu Bia!");
        } else if (resposta.equalsIgnoreCase("C")) {
            System.out.println("Você escolheu Samara!");
        } else {
            System.out.println("Opção inválida. Por favor, escolha A, B ou C.");
        }

        scanner.close();


    }
}