import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        //Tabralhe com valores que o usuario enviar.
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobreNome = input.nextLine();

        System.out.println("Seu nome é: "+ nome + " "+sobreNome);
    }
}
