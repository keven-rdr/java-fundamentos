package entities;

import entities.Enum.WorkerLevel;

import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<Contracts> contracts = new ArrayList<>();

    public Worker(){
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addContract(Contracts contract) {
        contracts.add(contract);
    }

    public void removeContract(Contracts contract) {
        contracts.remove(contract);
    }

    public double income(YearMonth monthAndYear){
        double sum = baseSalary;

        int c_year = monthAndYear.getYear();
        int c_month = monthAndYear.getMonthValue();

        for (Contracts c: contracts){
            if (c.getDate().getYear() == c_year && c.getDate().getMonthValue() == c_month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
