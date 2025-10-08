package cursojavaNelioAlves.entities;

import java.time.LocalDate;

public class Contracts {
    private LocalDate date;
    private Double value;
    private Integer duration;

    public Contracts(){
    }

    public LocalDate getDate() {
        return date;
    }

    public Contracts(LocalDate date, Double value, Integer duration) {
        this.date = date;
        this.value = value;
        this.duration = duration;
    }

   public double totalValue(){
        return value * duration;
   }
}
