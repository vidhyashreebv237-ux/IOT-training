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

public class p13 extends GrandParent{

	public static void main(String[] args) {
 		p13  bb= new p13();
 		bb.bp();
 		bb.cancer();
	}

	private void cancer() {

	}
}

