package day2;
interface Atm {
	abstract void depo();
}
interface Atm1 {
	abstract void min();
}
public class p21 implements Atm, Atm1 {
	public void depo() {
		System.out.println("dep");
	}
	public void min() {
		System.out.println("min");
	}
	public static void main(String[] args) {
		p21 v = new p21();
		v.min();
		v.depo();
	}
}