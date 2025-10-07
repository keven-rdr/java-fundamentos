package cursojavaNelioAlves.entities;

public class CurrencyConverter {
    public double dollar;
    public double buy;

    //criando um valor contante que não vai variar
    public static final double perc = 0.06;

    public double buyDollar(){
        return dollar * buy;
    }
    public double resultBought (){
        return buyDollar() + (buyDollar() * perc) ;
    }

}
