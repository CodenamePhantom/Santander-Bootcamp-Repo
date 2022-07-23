import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Bem vindo ao exercício da DIO.");
        System.out.println("Escolha a ferramenta: \n1 - Calculadora \n2 - Calendário \n3 - Emprestimo");
        int ferramentaEscolhida = Conversor.conversorInt(userInput.next());

        System.out.flush();
        switch (ferramentaEscolhida) {
            case 1 -> Calculadora.calculadora();
            case 2 -> Calendario.calendario();
            case 3 -> Emprestimo.emprestimo();
        }
    }
}