package Abstractclass.Abstractclass;

public abstract class Medical {

    protected String serviceId;
    protected String serviceName;
    protected double baseCost;

    public Medical(String serviceId, String serviceName, double baseCost) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.baseCost = baseCost;
    }

    public abstract double CalculateTotalCost();

        public void displayserviceInfo () {
        System.out.println("service ID:" + serviceId);
        System.out.println("service :" + serviceName);
        System.out.printf("Total cost: $%.2f%n%n", CalculateTotalCost());
    }
    }

