package Abstractclass;



    public class Ultrasound extends Medical{
        private double additionalfee;

        public Ultrasound (String serviceId, double baseCost,
                           double additionalfee){
            super(serviceId ,"ultrasound" , baseCost);
            this.additionalfee =additionalfee;
        }
        @Override
        public double CalculateTotalCost(){
            return baseCost +additionalfee;
        }
    }

