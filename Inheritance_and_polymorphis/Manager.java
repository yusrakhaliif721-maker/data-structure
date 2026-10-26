package Inheritance_and_polymorphis;



    public  class Manager extends Employee{
        private  double bonus;

        public Manager (String employeeId, String name,
                        String department , double basicSalary,double bonus){
            super( employeeId , name , department , basicSalary);
            this.bonus = bonus;
        }
        @Override
        public double calculatesalary(){
            return basicSalary +bonus;
        }
    }

