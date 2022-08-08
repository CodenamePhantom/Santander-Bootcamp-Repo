import java.util.Scanner;

public class Calculadora {
        public static void calculadora() {
            Scanner userInput = new Scanner(System.in);

            System.out.println("CALCULADORA");
            int firstNumber = Conversor.conversorInt("Digite o primeiro numero: ");
            int secondNumber = Conversor.conversorInt("Digite o segundo numero: ");
            System.out.println(firstNumber + secondNumber);
            System.out.println(firstNumber - secondNumber);
            System.out.println(firstNumber * secondNumber);
            if (firstNumber != 0 && secondNumber != 0) {
                System.out.println(firstNumber + secondNumber);
            } else {
                System.out.println("Divisão com zero não pode :(");
            }
        }
}
