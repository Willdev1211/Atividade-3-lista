import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        int quantidade = 10;

        for (int i = 0; i < quantidade; i++) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
