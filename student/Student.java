package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Student name is Ram Prasad");
	}
	public void studentDept() {
		System.out.println("Student Department is IT");
	}
	public void studentId() {
		System.out.println("Student Id is 03UM36");
	}
	
	public static void main(String args[]) {
		
		Student student = new Student();
		student.collegeCode();
		student.collegeName();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
		
	}

}
