package cursojavaNelioAlves.dataHora;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) throws IOException{

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate do1 = LocalDate.now();
        LocalDateTime do2 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-10-03");
        LocalDateTime d05 = LocalDateTime.parse("2025-10-03T10:15:30");
        Instant d06 = Instant.parse("2025-10-03T10:15:30Z");
        Instant d07 = Instant.parse("2025-10-03T10:15:30-03:00");

        //converter de string para data hora, tem que passar o segundo argumento para converter para o ISO
        LocalDate d08 = LocalDate.parse("2025/10/03", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        System.out.println("d01 = "+do1);
        System.out.println("d02 = "+do2);
        System.out.println("d03 = "+d03);//Z indica que é uma data hora GMT, ele gera nesse caso 3 horas a frente, em londre é  18:03:55, diferente do time que foi 15:03:55
        System.out.println("d04 = "+d04);
        System.out.println("d05 = "+d05);
        System.out.println("d06 = "+d06);
        System.out.println("d07 = "+d07);//coloando para aparecer a hora no horario de londres
        System.out.println("d08 = "+d08);
        System.out.println("d09 = "+d09);
    }
}
