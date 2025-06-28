import java.util.Scanner;

public class Filtro {
    public static void executarFiltro(int base, int quantidade, Scanner scanner) {
        System.out.println("Digite os " + quantidade + " números:");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > base && numero % base != 0) {
                System.out.println("Válido: " + numero);
            }
        }
    }
}
