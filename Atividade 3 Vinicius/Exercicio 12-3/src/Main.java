import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);

        scanner.close();
    }
}
