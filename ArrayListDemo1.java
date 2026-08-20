package day4;
import java.util.ArrayList;
public class ArrayListDemo1 {
	public static void main(String[]arg) {
		ArrayList list=new ArrayList();
		System.out.println("Intial size of ArrayLIst before addong elements:"+list.size());
		System.out.println("ArrayList is empty before adding values: " + list.isEmpty());
        System.out.println("Contents of ArrayList before adding values: " + list);
        list.add("C");
        list.add("A");
        list.add("E");
        list.add("B");
        list.add("D");
        list.add("F");

        list.add("A");
        list.add(null);
        
        System.out.println("Size of ArrayList after adding elements: " + list.size());
        System.out.println("ArrayList i empty after adding values: " + list.isEmpty());
        System.out.println("Contents of ArrayList after adding values: " + list);
        boolean b1=list.contains("E");
        System.out.println("Value E i s present:"+b1);
        boolean b2=list.contains("R");
        System.out.println("Value R i s present:"+b2);
        list.remove("B");
        System.out.println("Size of ArrayList after deletion : " + list.size());
        System.out.println("Contents of ArrayList after deletion: " + list);
        list.clear();
        System.out.println("Size of ArrayList after clearing: " + list.size());
        System.out.println("Contents of ArrayList after clearing: " + list);

    }
}

