import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;


        int numeroDePessoas = 10;


        for (int i = 1; i <= numeroDePessoas; i++) {
            System.out.print("Digite o nome da " + i + "ª pessoa: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine();


            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }


        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);


        scanner.close();
    }
}
