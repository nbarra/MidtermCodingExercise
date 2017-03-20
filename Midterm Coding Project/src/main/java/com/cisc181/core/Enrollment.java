package com.cisc181.core;
import java.util.UUID;
import java.util.Scanner;

public class Enrollment {

	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;

// no argument constructor 
	private Enrollment(){
	
}
// two argument constructor (they must be inputs)
	public Enrollment(UUID StudentID, UUID SectionID){
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public double getGrade(){
		return Grade;
	}
	
	public void setGrade(double grade){
		Grade = grade;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public void setSectionID(UUID sectionID){
		SectionID = sectionID;
	}
	
	public UUID getStudentID(){
		return StudentID;
	}
	
	public void setStudentID(UUID studentID){
		StudentID = studentID;
	}
	
	public UUID getEnrollmentID(){
		return EnrollmentID;
	}
	
	public void setEnrollmentID(UUID enrollmentID){
		EnrollmentID = enrollmentID;
	}
}