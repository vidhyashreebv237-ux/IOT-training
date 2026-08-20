package day4;

public class salary {
	    public static void main(String[] args) {

	        int[] salaries = {10000, 15000, 12000, 18000, 20000};
	        int total = 0;

	        for (int i = 0; i < salaries.length; i++) {
	            total = total + salaries[i];
	        }

	        System.out.println("Total Salary = " + total);
	    }
	}

