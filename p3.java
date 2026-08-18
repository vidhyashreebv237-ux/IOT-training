package day2;


	class Parents
	{
	   void property()
	   {
		   System.out.println("Property");
	   }
	   void marry()
	   {
		   System.out.println("famaily selected girl/boy");
	   }
	}
	public class p3 extends Parents {
		void marry()
		{
			System.out.println("campus selected girl/boy");
		}
		public static void main(String[] args) {
			p3 test = new p3();// object
			test.marry();
			test.property();
		
		}
	}

