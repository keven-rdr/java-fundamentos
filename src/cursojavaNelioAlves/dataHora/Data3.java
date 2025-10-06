package cursojavaNelioAlves.dataHora;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Data3 {
    public static void main (String[] args) throws IOException{

        //Transformar uma data global em uma data local, precisa passar o timeZone
        LocalDate d04 = LocalDate.parse("2022-05-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-05-20T10:15:30");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //vai pegar o d06 e vai converter para a data local considerando a minha zona
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("R1 = "+r1); // impressão foi exemplo:2022-07-19 diferente do valor do d06

        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("R2 = "+r2);

        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("R4 = "+r4);
        System.out.println("d04 dia = "+ d04.getDayOfMonth());
        System.out.println("d04 mês = "+ d04.getMonthValue());
        System.out.println("d04 ano = "+ d04.getYear());

        System.out.println("d05 hora = "+ d05.getHour());
        System.out.println("d05 hora = "+ d05.getMinute());

    }
}
