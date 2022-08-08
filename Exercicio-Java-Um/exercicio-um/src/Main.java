import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Bem vindo ao exercício da DIO.");
        int ferramentaEscolhida = Conversor.conversorInt("Escolha a ferramenta: \n1 - Calculadora \n" +
                "2 - Calendário \n3 - Emprestimo \n4 - Calculo de data");

        switch (ferramentaEscolhida) {
            case 1 -> Calculadora.calculadora();
            case 2 -> Calendario.calendario();
            case 3 -> Emprestimo.emprestimo();
            case 4 -> Mes.mes();
            default -> System.out.println("Opção não disponivel");
        }
    }
}