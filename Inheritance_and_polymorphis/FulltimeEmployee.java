package Inheritance_and_polymorphis;



    public class FulltimeEmployee extends Employee{
        private double allwance;

        public FulltimeEmployee ( String employeeId, String name,
                                 String department , double basicSalary, double allwance ){
            super(employeeId, name, department, basicSalary);
            this.allwance =allwance;
        }
        @Override
        public  double calculatesalary(){
            return basicSalary +allwance;
        }

    }

