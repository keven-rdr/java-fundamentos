package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    //Dessa forma esse o padrão, e os demais são personalizados que eu escolher ter todos ou so alguns parametros
    public Product (){
    }

    //objeto (parametros), obrigado passar um valor para nao exister name null, price 0.0 e quantity 0
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //Esse segundo construtor e uma sobre carga, eu posso usar as 2 versões na qual uma eu posso iniciar ja colocando
    //o valor de quantidade, e caso eu não tenha e so usar o construtor que não tem como parametro o quantity
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }
    //this fala que eu quero acessar o meu atributo da classe o que esta product, para diferenciar o que esta vindo como parametro
    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }


}
