package com.student.pro;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Studentvalidator {
	
	public boolean isValidStudentname(Student student) {
		String p="^[a-zA-Z]*$";
		if(student.getStudentname().matches(p))
			return true;
		else
			return false;
	}
	public boolean isValidDate(Student student) {
		Date date=student.getBirthday();
		LocalDate date1= LocalDate.ofInstant(date.toInstant(),ZoneId.systemDefault());
		LocalDate date2=LocalDate.now();
		Period dif=Period.between(date1, date2);
		System.out.print(dif.getYears());
		return true;
	}
	public boolean isValidMarks(Integer[] marks) {
		boolean result=true;
		for(int i:marks) {
			if(i>=0 && i<=100)
				result=true;
			else
				result=false;
			
			
		}
		return result;
	}
	public boolean isValidStudent(Student students) {
		if(isValidStudentname(students) && isValidDate(students) && isValidMarks(students.getMarks())) {
			return true;
		}
		else
			return false;
	}
	

}
