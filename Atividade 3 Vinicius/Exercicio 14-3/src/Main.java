import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorEntre0e100 = 0;
        int contadorEntre101e200 = 0;
        int contadorMaioresQue200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                contadorEntre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                contadorEntre101e200++;
            } else if (numero > 200) {
                contadorMaioresQue200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + contadorEntre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + contadorEntre101e200);
        System.out.println("Quantidade de números maiores que 200: " + contadorMaioresQue200);

        scanner.close();
    }
}
