package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> CourseList = new ArrayList<Course>();
	static Course Course1;
	static Course Course2;
	static Course Course3;
	
	static ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	static Semester Fall;
	static Semester Spring;
	
	static ArrayList<Section> SectionList = new ArrayList<Section>();
	static Section Section1Course1Fall;
	static Section Section1Course2Fall;
	static Section Section1Course3Fall;
	static Section Section2Course1Spring;
	static Section Section2Course2Spring;
	static Section Section2Course3Spring;
	
	static ArrayList<Student> StudentList = new ArrayList<Student>();
	static Student student1;
	static Student student2;
	static Student student3;
	static Student student4;
	static Student student5;
	static Student student6;
	static Student student7;
	static Student student8;
	static Student student9;
	static Student student10;
	static ArrayList<Enrollment>EnrollmentList = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setup() throws PersonException {
		Course1 = new Course("Chemistry 104",5,eMajor.CHEM);
		Course2 = new Course("CISC 106",7,eMajor.COMPSCI);
		Course3 = new Course("Nursing 101",14,eMajor.NURSING);
		CourseList.add(Course1);
		CourseList.add(Course2);
		CourseList.add(Course3);
	
	
		Fall = new Semester(new Date(), new Date());
		Spring = new Semester(new Date(), new Date());
		SemesterList.add(Fall);
		SemesterList.add(Spring);
	
		Section1Course1Fall = new Section(Course1.getCourseID(), Fall.getSemesterID(),120);
		Section1Course2Fall = new Section(Course2.getCourseID(), Fall.getSemesterID(),456);
		Section1Course3Fall = new Section(Course3.getCourseID(), Fall.getSemesterID(),321);
		Section2Course1Spring = new Section(Course1.getCourseID(), Spring.getSemesterID(),123);
		Section2Course2Spring = new Section(Course2.getCourseID(), Spring.getSemesterID(),564);
		Section2Course3Spring = new Section(Course3.getCourseID(), Spring.getSemesterID(),300);

		student1 = new Student("fname1","m1","lname1",new Date(),"BUSINESS","address1","123-456-3456","email1");
		student2 = new Student("fname2","m2","lname2",new Date(),"COMPSCI","address2","456-987-2974","email2");
		student3 = new Student("fname3","m3","lname3",new Date(),"CHEM","address3","673-857-9364","email3");
		student4 = new Student("fname4","m4","lname4",new Date(),"PHYSICS","address4","873-918-3450","email4");
		student5 = new Student("fname5","m5","lname5",new Date(),"NURSING","address5","453-9012-1852","email5");
		student6 = new Student("fname6","m6","lname6",new Date(),"BUSINESS","address6","572-150-0000","email6");
		student7 = new Student("fname7","m7","lname7",new Date(),"COMPSCI","address7","112-246-8244","email7");
		student8 = new Student("fname8","m8","lname8",new Date(),"CHEM","address8","259-245-2390","email8");
		student9 = new Student("fname9","m9","lname9",new Date(),"BUSINESS","address9","675-492-9150","email9");
		student10 = new Student("fname10","m10","lname10",new Date(),"NURSING","address10","908-813-8674","email10");
	
		StudentList.add(student1);
		StudentList.add(student2);
		StudentList.add(student3);
		StudentList.add(student4);
		StudentList.add(student5);
		StudentList.add(student6);
		StudentList.add(student7);
		StudentList.add(student8);
		StudentList.add(student9);
		StudentList.add(student10);
				
	}
	
	
//	@Test 
//	public double StudentGrade(UUID StudentID){
//		EnrollmentList.get(0).setGrade(0.0);
//		EnrollmentList.get(1).setGrade(1.0);
//		EnrollmentList.get(2).setGrade(2.0);
//		EnrollmentList.get(3).setGrade(3.0);
//		EnrollmentList.get(4).setGrade(4.0);
//		EnrollmentList.get(5).setGrade(5.0);
//		EnrollmentList.get(6).setGrade(6.0);
//		EnrollmentList.get(7).setGrade(7.0);
//		EnrollmentList.get(8).setGrade(8.0);
//		EnrollmentList.get(9).setGrade(9.0);
		
		
		
		
	
				
				
				
				
				
}