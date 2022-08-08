import java.util.Scanner;

public class Emprestimo {
    public static void emprestimo() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("EMPRESTIMO");
        float valorEmprestimo = Conversor.conversorFloat("Digite o valor do emprestimo: ");
        int quantidadeParcelas = Conversor.conversorInt("Digite as parecelas de pagamento (Disponivel: 2, 3, 4)");
        switch (quantidadeParcelas) {
            case 2 -> impressorDeEmprestimo(valorEmprestimo, 1.4f, 2);
            case 3 -> impressorDeEmprestimo(valorEmprestimo, 1.67f, 3);
            case 4 -> impressorDeEmprestimo(valorEmprestimo, 1.8f, 4);
            default -> System.out.println("Quantidade solicitada não é atendida pela empresa X");
        }
    }

    private static void impressorDeEmprestimo(float valorEmprestimo, float taxa, int parcelas) {
        float valorFinal;

        valorFinal = valorEmprestimo * taxa;
        System.out.println("Valor a pagar: $" + valorFinal + " dividido em " + parcelas + " parcelas.");
    }
}
