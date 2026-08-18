package day2;

public class p6 {
	int a = 20;
	int b = 10;

	void m1(int a,int b ) {
		System.out.println("asdfas"+(this.a+this.b));

		System.out.println("dfasdf "+(a+b));
//		System.out.println("dfasdf "+(c+d));
	}

	public static void main(String[] args) {
		p6 vv = new p6();
		vv.m1(4,3);
	}
}
