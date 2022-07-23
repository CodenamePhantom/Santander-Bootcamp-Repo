import java.util.Scanner;

public class Calculadora {
        public static void calculadora() {
            Scanner userInput = new Scanner(System.in);
            int firstNumber;
            int secondNumber;

            System.out.println("CALCULADORA");
            System.out.print("Digite o primeiro numero: ");
            firstNumber = Conversor.conversorInt(userInput.next());
            System.out.print("Digite o segundo numero: ");
            secondNumber = Conversor.conversorInt(userInput.next());
            System.out.println(firstNumber + secondNumber);
            System.out.println(firstNumber - secondNumber);
            System.out.println(firstNumber * secondNumber);
            if (firstNumber != 0 || secondNumber != 0) {
                System.out.println(firstNumber + secondNumber);
            } else {
                System.out.println("Divisão com zero não pode :(");
            }
        }
}
