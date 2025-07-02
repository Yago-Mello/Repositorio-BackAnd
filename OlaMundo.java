import java.util.Scanner;

public class OlaMundo {

    public static void main(String[ ] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");

        String nome = entrada.nextLine();

        System.out.println("Olá, " + nome + "! Bem-vindo ao mundo do Java.");

        entrada.close();
    }
}
