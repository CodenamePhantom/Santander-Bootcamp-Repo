import java.time.LocalDate;

public class Mes {
    public static void mes() {
        int mesAtual = LocalDate.now().getMonthValue();
        int diaAtual = LocalDate.now().getDayOfWeek().getValue();
        switch (mesAtual) {
            case 1 -> System.out.println("Janeiro, férias");
            case 2 -> System.out.println("Fevereiro");
            case 3 -> System.out.println("Março");
            case 4 -> System.out.println("Abril");
            case 5 -> System.out.println("Maio");
            case 6 -> System.out.println("Junho");
            case 7 -> System.out.println("Julho, férias");
            case 8 -> System.out.println("Agosto");
            case 9 -> System.out.println("Setembro");
            case 10 -> System.out.println("Outubro");
            case 11 -> System.out.println("Novembro");
            case 12 -> System.out.println("Dezembro, férias");
        }
        switch (diaAtual) {
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terça");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
        }
    }
}
