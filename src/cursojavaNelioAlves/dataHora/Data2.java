package cursojavaNelioAlves.dataHora;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Data2 {
    public static void main (String[] args) throws IOException{
        //Pegar no formato ISO e passar para string (customizado)

        LocalDate d04 = LocalDate.parse("2022-05-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-05-20T10:15:30");
        Instant d06 = Instant.parse("2022-05-20T10:15:30Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("do4 = "+d04.format(fmt1));
        System.out.println("do4 = "+fmt1.format(d04));
        System.out.println("do4 = "+d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("-------------------");
        System.out.println("do5 = "+d05.format(fmt2));
        System.out.println("do5 = "+d05.format(fmt1));

        System.out.println("-------------------");
        //vai imprimir -3hrs, pq a referencia e o horario de Londres - região da maquina
        System.out.println("do6 = "+fmt3.format(d06));
        System.out.println("do6 = "+fmt5.format(d06));

        System.out.println("-------------------");
        System.out.println("do5 = "+d05.format(fmt4));


    }
}
