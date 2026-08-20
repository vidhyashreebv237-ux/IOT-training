package day4;
public class Electricity {
	    public static void main(String[] args) {
	        int[] units = {10, 15, 12, 20, 18, 14, 16};
	        int total = 0;

	        for (int i = 0; i < 7; i++) {
	            total = total + units[i];
	        }
	        System.out.println("Total electricity consumption = " + total + " units");
	    }
	}

