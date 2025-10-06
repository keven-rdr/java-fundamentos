package cursojava.dataHora;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//Lembrando que data e hora são objetos imutaveis, vc não entra dentro do objeto e altera ele.
//Ocorre que vc faz um copia dele e altera a copia quando vc quer a data anterior. Ou pegar 2 data/hora e comparar qual o tempo percorreu entre elas
public class CalcDate {
    public static void main (String[] args) throws IOException{

        LocalDate d04 = LocalDate.parse("2022-05-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-05-20T10:15:30");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //Uma semana antes
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        System.out.println("pastWeekLocalDate = "+pastWeekLocalDate);
        //Proxima semana
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        System.out.println("nextWeekLocalDate = "+nextWeekLocalDate);

        //Uma semana antes
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        System.out.println("pastWeekLocalDateTime = "+pastWeekLocalDateTime);
        //Proxima semana
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
        System.out.println("nextWeekLocalDateTime = "+nextWeekLocalDateTime);

        //Uma semana antes
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("pastWeekInstant = "+pastWeekInstant);
        //Proxima semana
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("nextWeekInstant = "+nextWeekInstant);


        //Duração entre duas data hora
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t1 dias = "+t2.toDays());

    }
}
