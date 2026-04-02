package com.practice.SpringDI;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Component is used to define a class a component
**/
@Component
public class Student {
	
	/**
	 * @value annotation is used to assign values for a variables in components. When they are scanned by the AppConfig.class file
	**/
	
//	@Value("2400030371") 
	private long studentId;
//	@Value("Bhargav")
	private String studentName;
//	@Value("Full_Stack_Annotations")
	private String courseName;
//	@Value("2024")
	private int acadamicYear;
	
	/**
	 * Each constructor and setter method is used in beans with specific id names
	 * We assign values using bean in the applicationConfiguration.xml*/
	
	public Student() {
		
	}
	
	public Student(long studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getAcadamicYear() {
		return acadamicYear;
	}

	public void setAcadamicYear(int acadamicYear) {
		this.acadamicYear = acadamicYear;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseName=" + courseName
				+ ", acadamicYear=" + acadamicYear + "]";
	}
	public Student(long i, String string, String string2, int j) {
		// TODO Auto-generated constructor stub
		this.studentId = i;
		this.studentName = string;
		this.courseName = string2;
		this.acadamicYear = j;
	}
	
	
}
