import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (negativo para encerrar): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        System.out.println("A soma dos números digitados é: " + soma);

        scanner.close();
    }
}
