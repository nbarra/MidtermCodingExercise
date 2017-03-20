package com.cisc181.core;
import java.util.UUID;
import com.cisc181.eNums.eMajor;
public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoint;
	private eMajor Major;
	
	public Course(String CourseName, int GradePoint, eMajor Major){
		this.CourseID = UUID.randomUUID();
		this.CourseName = CourseName;
		this.GradePoint = GradePoint;
		this.Major = Major;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public void setCourseID(UUID courseID){
		CourseID = courseID;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public void setCourseName(String courseName){
		CourseName = courseName;
	}
	
	public int getGradePoint(){
		return GradePoint;
	}
	
	public void setGradePoint(int gradePoint){
		GradePoint = gradePoint;
	}
	
	public eMajor getMajor(){
		return Major;
	}
	
	public void setMajor(eMajor major){
		Major = major;
	}

}
