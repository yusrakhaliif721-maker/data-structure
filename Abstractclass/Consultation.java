package Abstractclass;



    public class Consultation extends Medical{
        private double doctorFee;

        public Consultation ( String serviceId, double baseCost,
                              double doctorFee){
            super( serviceId , "Consultation" ,baseCost);
            this.doctorFee =doctorFee;
        }
        @Override
        public double CalculateTotalCost(){
            return  baseCost + doctorFee;
        }
    }


