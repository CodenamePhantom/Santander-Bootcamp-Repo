import java.util.Scanner;

public class Nota {
    public static void nota() {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota invalida. Digite novamente: ");
            nota = scan.nextInt();
        }
    }
}
