package Abstractclass;

public class Main {

    static void main(String[] args) {
        Medical[] medicals = {
                new Consultation("SOO1" , 15 , 10),
                new Laboratory("SOO2" , 10, 8),
                new Ultrasound("SOO3" , 25 , 15),
        };
        double totalBill =0;
        System.out.println("======HOSPITAL BILLING SYSTEM=======");
        System.out.println();
        for (Medical medical : medicals){
            medical.displayserviceInfo();

        }
        System.out.println("--------------------------------");
        System.out.printf("total hospital bill : $%.2fn%n" , totalBill);
    }
}
