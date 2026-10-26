package Abstractclass;



    public class Laboratory extends  Medical{
        private  double testcharge;

        public Laboratory(String serviceId, double baseCost,
                          double testcharge){
            super(serviceId , "laboratory test" , baseCost);
            this.testcharge =testcharge;

        }
        @Override
        public double CalculateTotalCost(){
            return baseCost + testcharge;
        }
    }

