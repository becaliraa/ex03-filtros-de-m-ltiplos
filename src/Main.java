import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número base: ");
        int base = scanner.nextInt();

        System.out.print("Quantos números deseja informar? ");
        int quantidade = scanner.nextInt();

        Filtro.executarFiltro(base, quantidade, scanner);
    }
}
