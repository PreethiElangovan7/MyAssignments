package week3.day2;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("method1"+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("method2"+id+name);
	}
	public void getStudentInfo(String email, int phoneNumber) {
		System.out.println("method3"+email+phoneNumber);
		}
	public static void main(String[] args) {
		Students ss = new Students();
		ss.getStudentInfo(1);
		ss.getStudentInfo(2, "king");
		ss.getStudentInfo("king@king.com", 123123212);
	}

}
