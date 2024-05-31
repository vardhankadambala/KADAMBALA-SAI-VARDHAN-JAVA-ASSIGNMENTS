package com.student.pro;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private Integer admissioncode;
	private String studentname;
	private Date birthday;
	private Integer[] marks;
	private String grade;
	private static Integer admissioncounter;
	private static String schoolname;
	
	public Student(Integer admissioncode, String studentname, Date birthday, Integer[] marks,String grade) {
		super();
		this.admissioncode=admissioncode;
		this.studentname=studentname;
		this.birthday=birthday;
		this.marks=marks;
		this.grade=grade;
	}
	public Integer getAdmissioncode() {
		return admissioncode;
	}
	public void setAdmissioncode(Integer admissioncode) {
		this.admissioncode=admissioncode;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname=studentname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday=birthday;
	}
	public Integer[] getMarks() {
		return marks;
	}
	public void setMarks(Integer[] marks) {
		this.marks=marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setgrade(String grade) {
		this.grade=grade;
	}
	public static Integer getAdmissiocounter() {
		return admissioncounter;
	}
	public static void setAdmissioncounter(Integer admisssioncounter) {
		Student.admissioncounter=admisssioncounter;
	}
	public static String getSchoolname() {
		return schoolname;
	}
	public static void setSchoolname(String schoolname) {
		Student.schoolname=schoolname;
	}
	@Override
	public String toString() {
		return "Student [admissioncode=" + admissioncode + ", studentname=" + studentname + ", birthday=" + birthday
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}
	
}
