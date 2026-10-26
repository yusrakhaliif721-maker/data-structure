package Inheritance_and_polymorphis;

public class PartimeEmployee  extends Employee {

    private int hoursworked;
    private double hourlyrate;

    public PartimeEmployee(String employeeId, String name, String department,
                           int hoursworked, int hourlyrate) {
        super(employeeId, name, department, 0);
        this.hoursworked =hoursworked;
        this.hourlyrate =hourlyrate;


    }
    @Override
    public double calculatesalary(){
        return hoursworked * hourlyrate;
    }
}

