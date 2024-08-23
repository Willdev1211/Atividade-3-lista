import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();


        System.out.print("Digite o número de vezes que deseja exibir o nome: ");
        int numeroDeVezes = scanner.nextInt();


        for (int i = 0; i < numeroDeVezes; i++) {
            System.out.println(nome);
        }


        scanner.close();
    }
}
