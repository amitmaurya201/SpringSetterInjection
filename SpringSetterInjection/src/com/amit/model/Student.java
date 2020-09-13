package com.amit.model;

public class Student {
	private int studentId;
	private String studentName;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddess=" + studentAddess
				+ "]";
	}
	private String studentAddess;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddess() {
		return studentAddess;
	}
	public void setStudentAddess(String studentAddess) {
		this.studentAddess = studentAddess;
	}
	
}
