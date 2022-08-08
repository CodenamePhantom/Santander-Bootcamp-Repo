import java.util.Scanner;

public class Conversor {
    public static float conversorFloat (String request) {
        Scanner userInput = new Scanner(System.in);
        float convertedNumber = 0;
        boolean checado = false;

        do {
            System.out.println(request);
            String number = userInput.next();
            try {
                convertedNumber = Float.parseFloat(number);
                checado = true;
            } catch (NumberFormatException error) {
                System.out.println("Valor informado não é número.");
            }
        } while (!checado);
        return convertedNumber;
    }
    public static int conversorInt (String request) {
        Scanner userInput = new Scanner(System.in);
        int convertedNumber = 0;
        boolean checado = false;

        do {
            System.out.println(request);
            String number = userInput.next();
            try {
                convertedNumber = Integer.parseInt(number);
                checado = true;
            } catch (NumberFormatException error) {
                System.out.println("Valor informado não é número.");
            }
        } while(!checado);
        return convertedNumber;
    }
}
