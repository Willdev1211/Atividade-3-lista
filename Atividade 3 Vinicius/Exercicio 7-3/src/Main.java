import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int soma = 0;
        int numeroDePessoas = 20;


        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            soma += idade;
        }


        double media = (double) soma / numeroDePessoas;


        System.out.println("A média das idades das " + numeroDePessoas + " pessoas é: " + media);


        scanner.close();
    }
}
