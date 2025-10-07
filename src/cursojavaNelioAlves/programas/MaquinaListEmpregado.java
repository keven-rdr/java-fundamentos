package cursojavaNelioAlves.programas;

import cursojavaNelioAlves.entities.Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaquinaListEmpregado {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++){
            System.out.println("\nEmployee #"+(i+1)+" :");
            System.out.print("Id: ");
            int id = Integer.parseInt(br.readLine());
            System.out.print("Name: ");
            String name = String.valueOf(br.readLine());
            System.out.print("Salary: ");
            double salary = Double.parseDouble(br.readLine());

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int idSalary = Integer.parseInt(br.readLine());
        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = Double.parseDouble(br.readLine());
            list.get(pos).increaseSalary(percent);
        }

        System.out.println("\nList of employees:");
        for (Employee emp : list){
            System.out.println(emp);
        }

    }

    //encontrar a posição na lista
    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null; //se não for encontrado, so dar certo se eu usar o int no lugar do INTEGER, se usar integer deve retornar null = return null, se usar int deve retorn -1
    }
}
