package day4;
import java.util.HashSet;

public class Demo1 {
	public static void main(String[] args) {

	        int n = 100000;
	        HashSet<Integer> students = new HashSet<>();

	        for (int i = 0; i < n; i++) {
	            students.add(i + 1);
	        }

	        int target = 1000;

	        boolean found = students.contains(target);

	        System.out.println("Student Found:" + found);
	    }
	}
