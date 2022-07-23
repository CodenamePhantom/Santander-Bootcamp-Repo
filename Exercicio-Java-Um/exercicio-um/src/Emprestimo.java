import java.util.Scanner;

public class Emprestimo {
    public static void emprestimo() {
        Scanner userInput = new Scanner(System.in);
        float valorEmprestimo;
        int quantidadeParcelas;

        System.out.println("EMPRESTIMO");
        System.out.print("Digite o valor do emprestimo: ");
        valorEmprestimo = Conversor.conversor(userInput.next());
        System.out.println("Digite as parecelas de pagamento (Disponivel: 2, 3, 4)");
        quantidadeParcelas = Conversor.conversorInt(userInput.next());
        if (quantidadeParcelas < 2 || quantidadeParcelas > 4) {
            System.out.println("Quantidade solicitada não é atendida pela empresa X");
        } else {
            switch (quantidadeParcelas) {
                case 2 -> impressorDeEmprestimo(valorEmprestimo, 0.4f, 2);
                case 3 -> impressorDeEmprestimo(valorEmprestimo, 0.67f, 3);
                case 4 -> impressorDeEmprestimo(valorEmprestimo, 0.8f, 4);
            }
        }
    }

    private static void impressorDeEmprestimo(float valorEmprestimo, float taxa, int parcelas) {
        float valorFinal;

        valorFinal = valorEmprestimo * taxa;
        System.out.println("Valor a pagar: $" + valorFinal + " dividido em " + parcelas + " parcelas.");
    }
}
