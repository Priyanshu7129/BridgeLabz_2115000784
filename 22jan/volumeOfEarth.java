public class volumeOfEarth{
        public static void main(String[] args){
                double radiusKm = 6378.0;
                double conversionFactor = 0.62;

                double volumeKm = Math.PI * (4/3) * Math.pow(radiusKm, 3);

                double radiusMiles = radiusKm * conversionFactor;
                double volumeMiles = (4/3) * Math.PI * Math.pow(radiusMiles, 3);

                System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
}
}

