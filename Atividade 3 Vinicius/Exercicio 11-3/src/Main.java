import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 8) {
                contador++;8

            }
        }

        System.out.println("Quantidade de números maiores que 8: " + contador);

        scanner.close();
    }
}
