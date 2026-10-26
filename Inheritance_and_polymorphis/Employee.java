package Inheritance_and_polymorphis;

public class Employee {
    protected String employeeId;
    protected String name;
    protected String department;
    protected double basicSalary;

    public Employee(String employeeId , String name,
                    String department , double basicSalary ){
        this.employeeId =employeeId;
        this.name =name;
        this.department =department;
        this.basicSalary =basicSalary;

    }
    public double calculatesalary(){
        return basicSalary;
    }
    public  void displayInfo(String Category){
        System.out.println("employee id:" + employeeId);
        System.out.println("name:" + name);
        System.out.println("category:" + Category);
        System.out.printf("manth salary: $%.2f%n%n" , calculatesalary());




    }
}
