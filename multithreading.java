package day3;

public class multithreading extends Thread{
public void run() {
	for(int i=0; i<5; i++) {
		System.out.println("method"+1);
	}
}
public static void main(String[]args) {
	multithreading bb=new multithreading();
	bb.start();
	for(int i=0; i<5; i++){
		System.out.println("main method"+1);

	}
}
}
