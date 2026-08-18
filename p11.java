package day2;

class Parent
{
	void cancer()
	{
		System.out.println(" understain");
	}
	void bp()
	{
		System.out.println(" understain   bp");
	}
}

public class p11 extends Parent{

	public static void main(String[] args) {
 		p11  bb= new p11();
 		bb.bp();
 		bb.cancer();
	}
}


