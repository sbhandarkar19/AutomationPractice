package oopsEncapsulation;
// this program --> getter & setter method generated shortcut in Eclipse

// Shortcut ===> Right click within the class body --> Source --> Generate getter and setter.

// 1] for static variable     --> generate static getter & setter methods.
// 2] for non-static variable --> generate non-static getter & setter methods.

class SchoolResult {
	private int rollNum;
	private String studentName;
	private double studentTotalMarks;
	private static String schoolName;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentTotalMarks() {
		return studentTotalMarks;
	}

	public void setStudentTotalMarks(double studentTotalMarks) {
		this.studentTotalMarks = studentTotalMarks;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		SchoolResult.schoolName = schoolName;
	}

}

public class Encapsulation1 {

	public static void main(String[] args) {

	}

}
