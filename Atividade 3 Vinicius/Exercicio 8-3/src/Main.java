import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int contagemMaioresDeIdade = 0;
        int numeroDePessoas = 20;


        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();


            if (idade >= 18) {
                contagemMaioresDeIdade++;
            }
        }


        System.out.println("Número de pessoas maiores de idade: " + contagemMaioresDeIdade);


        scanner.close();
    }
}
