import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMedia {
    public static void maiorEMedia() {
        Scanner scan = new Scanner(System.in);

        int numero;
        int soma = 0;

        int count = 0;
        int maior = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;
            if (numero > maior) maior = numero;

            ++count;
        } while (count < 5);

        System.out.println(soma);
        System.out.println(maior);
    }
}
