package cursojavaNelioAlves.entities;

public class OutsourcedEmployee extends EmployeeTwo{

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
        super(name, hours, valuePerHour);
    }

    @Override
    public Double payment(){
        return super.payment() * 1.10;
    }
}
