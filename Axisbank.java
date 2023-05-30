package week3.day2;

public class Axisbank extends Bankinfo {
	public void deposit() {
		System.out.println("deposit of Axisbank");
	}
	public static void main(String[] args) {
		Bankinfo bi = new Bankinfo();
		bi.deposit();
	}

}
