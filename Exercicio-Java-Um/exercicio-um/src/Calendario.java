import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendario {
    public static void calendario() {
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter templateFormatacao = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy',' HH:mm:ss");

        String dataAtualFormatada = dataAtual.format(templateFormatacao);
        System.out.println("CALENDÁRIO");
        System.out.println("Data atual: " + dataAtualFormatada);
    }
}
