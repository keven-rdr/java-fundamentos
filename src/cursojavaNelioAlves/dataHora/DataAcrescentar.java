package cursojavaNelioAlves.dataHora;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataAcrescentar {
    public static void main (String[] args) throws IOException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("------------------");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(sdf.format(d));

        //Acrescentar 4 horas nessa data
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
//        cal.add(Calendar.HOUR_OF_DAY, 4);
//        d = cal.getTime();

        //Para saber quanto minutos tem na variavel d
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("minutes: "+ minutes);
        //Para saber quantos meses, precisa colocar +1. pq ele inicia do zero
        int mouth = 1 + cal.get(Calendar.MONTH);
        System.out.println("month: "+ mouth);

        System.out.println("------------------");
        System.out.println(sdf.format(d));
    }
}
