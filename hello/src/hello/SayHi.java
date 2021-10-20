package hello;

public class SayHi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello!");
		printConversion(1.25);

	}
	
	    // write your code here
	    public static long toMilesPerHour(double kilometersPerHour){
	        if (kilometersPerHour < 0) {
	            return -1;
	        } else {
	            double convertKilosToMiles = (kilometersPerHour / 1.609);
	            System.out.println(convertKilosToMiles);
	            long roundedMilesPerHour = (long) Math.round(convertKilosToMiles);
	            return (long) roundedMilesPerHour;
	        }
	        
	    }
	    
	    public static void printConversion( double kilometersPerHour ) {
	        
	        if (kilometersPerHour < 0){
	            System.out.println("Invalid Value");
	        } else {
	        int milesPerHour = (int) toMilesPerHour(kilometersPerHour);
	        // System.out.println();
	        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
	        }

	    }
	}


