package day2;

class GrandParent
{
	void bp()
	{
		System.out.println(" understain   bp");
	}
}
class Parent extends GrandParent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	
}

public class p12 extends Parent{

	public static void main(String[] args) {
 		p12  bb= new p12();
 		bb.bp();
 		bb.cancer();
	}
}

