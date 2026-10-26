package Inheritance_and_polymorphis;

public class Main {

    static void main(String[] args) {
       Employee []  employees = {
               new FulltimeEmployee(
                       "EMP001", "Axmed Ali", "IT",
                       550, 100),
               new PartimeEmployee(
                       "EMPOO2", "Yusra khaliif", "lab",
                       300 , 8 ),



               new Manager(
                       "EMPOO3", "saliin hasan", "management",
                       1000 , 200 ),


       };
       System.out.println("==== EMPLOYEE SALARY REPORT =========");
       System.out.println();

       employees[0].displayInfo("Full_time Employee");
        employees[1].displayInfo("Part_time Employee");
        employees[2].displayInfo("manager");







    }
}