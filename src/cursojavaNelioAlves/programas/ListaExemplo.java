package cursojavaNelioAlves.programas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListaExemplo {
    public static void main (String[] args) throws IOException{

        //tem que usar o RaperClass = (Integer), não pode usar o tipo primitivo como int
        //<>tudo aqui tem que ser do mesmo tipo
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //como adicionar novo nome em uma posição que ja esta ocupada
        list.add(2, "Marco");

        System.out.println(list.size());

        //remover anna da list, sendo esse Anna uma nova instancia.
        //o que ele faz e comparar os nomes e se for igual remove da lista
        //list.remove("Anna");
        //remove por conta posição, não comparação
        //list.remove(1);
        //remover os que são predicados, exemplo, remover todos que começam com a letra "M"
        //pega um valor x do tipo string, sendo esse x.chart = M, vai retornar verdadeiro ou falso
        //list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list){
            System.out.println(x);
        }

        System.out.println("------------------------------");
        //encontrar a posição de um elemento
        System.out.println("Index of Bob: "+list.indexOf("Bob"));
        //se não acha retorna -1
        System.out.println("Index of Bob: "+list.indexOf("Marco"));
        System.out.println("------------------------------");

        //filtrar pra mostrar somentar quem eu quero, tipo so com a letra A, operações de lambda = x -> x.charAt(0) == 'A'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("------------------------------");
        //quero encontar o primeiro elemento que começa com a letra "A"
        //pega o primeiro elemento da lista que começa com a letra A e se nao tiver trazer nulo
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
