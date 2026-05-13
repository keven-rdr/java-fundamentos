package cursojavaNelioAlves.application;

import cursojavaNelioAlves.entities.EmployeeTwo;
import cursojavaNelioAlves.entities.OutsourcedEmployee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ProgramSalaryEmployee {
    static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<EmployeeTwo>  listEmployee = new ArrayList<>();

        EmployeeTwo employee = new EmployeeTwo();
        OutsourcedEmployee outsourcedEmployee = new OutsourcedEmployee();

        System.out.printf("Do you want to add a new employee? 1 - yes | 2 - no \n");
        int cond = Integer.parseInt(br.readLine());

        while (cond == 1) {

            System.out.printf("How is type employee? 1 - Full-time | 2 - Outsourced \n");
            int n = Integer.parseInt(br.readLine());

            if (n == 1){
                System.out.printf("Enter the name of employee: ");
                employee.setName((br.readLine()));

                System.out.printf("Enter the hours worked in a week: ");
                employee.setHours(Integer.parseInt(br.readLine()));

                System.out.printf("Enter the value of the hour: ");
                employee.setValuePerHour(Double.parseDouble(br.readLine()));

                listEmployee.add(employee);

            }else if (n == 2){
                System.out.printf("Enter the name of employee: ");
                outsourcedEmployee.setName((br.readLine()));

                System.out.printf("Enter the hours worked in a week: ");
                outsourcedEmployee.setHours(Integer.parseInt(br.readLine()));

                System.out.printf("Enter the value of the hour: ");
                outsourcedEmployee.setValuePerHour(Double.parseDouble(br.readLine()));

                listEmployee.add(outsourcedEmployee);
            }else {
                System.out.println("Invalid option!");
            }

            System.out.printf("\nDo you want to add a new employee? 1 - yes | 2 - no \n");
            cond = Integer.parseInt(br.readLine());
        }

        System.out.printf("List of employees + salaries: \n");

        for (EmployeeTwo e : listEmployee) {
            if (employee == employee){
                System.out.println("Full-time: " + e.getName() + " - $ " + String.format("%.2f", e.payment()));
            }
            else if (outsourcedEmployee == outsourcedEmployee){
                System.out.println("Outsourced: " + e.getName() + " - $ " + String.format("%.2f", e.payment()));
            }

        }
    }
}
