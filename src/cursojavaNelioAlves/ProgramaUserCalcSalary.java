package cursojavaNelioAlves;

import entities.Contracts;
import entities.Department;
import entities.Enum.WorkerLevel;
import entities.Worker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class ProgramaUserCalcSalary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2= DateTimeFormatter.ofPattern("MM/yyyy");

        System.out.println("------------------------\n");
        System.out.print("Enter departament´s name: ");
        Department department = new Department(br.readLine());
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = String.valueOf(br.readLine());
        System.out.print("Level: ");
        WorkerLevel level = WorkerLevel.valueOf(br.readLine());
        System.out.print("Base salary: ");
        double baseSalary = Double.parseDouble(br.readLine());
        Worker worker = new Worker(name, level, baseSalary, department);
        System.out.println("------------------------");

        System.out.print("How many contracts to this worker? ");
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter contract #"+(i+1)+" data:");

            System.out.print("\nDate (DD/MM/YYYY): ");
            String x = br.readLine();
            LocalDate date = LocalDate.parse(x, fmt);
            System.out.print("Value per hour: ");
            double value = Double.parseDouble(br.readLine());
            System.out.print("Duration (hours): ");
            int duration = Integer.parseInt(br.readLine());

            Contracts contracts = new Contracts(date, value, duration);
            worker.addContract(contracts);
        }

        System.out.println("------------------------");

        System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
        String y = br.readLine();
        YearMonth monthAndYear = YearMonth.parse(y, fmt2);

        System.out.print("Name: "+worker.getName());
        System.out.print("\nDepartament: "+ worker.getDepartment().getNameDepartment());
        System.out.println("\nIncome for " + monthAndYear.format(fmt2) + ": " + String.format("%.2f", worker.income(monthAndYear)));    }
}
