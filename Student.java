package week3.day2;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Print the student name");
	}
	public void studentDept() {
		System.out.println("Print the student department");
	}
	public void studentId() {
		System.out.println("Print the student id");
	}
	public static void main(String[] args) {
		Student S1 = new Student();
		S1.collegeCode();
		S1.collegeName();
		S1.collegeRank();
		S1.deptName();
		S1.studentName();
		S1.studentId();
		S1.studentId();
	}
	

}
