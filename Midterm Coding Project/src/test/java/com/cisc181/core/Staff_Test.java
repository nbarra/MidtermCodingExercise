package com.cisc181.core;

import com.cisc181.eNums.eTitle;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {
	
	static ArrayList <Staff> StaffList = new ArrayList<Staff>();
	static Staff employee1;
	static Staff employee2;
	static Staff employee3;
	static Staff employee4;
	static Staff employee5;

	@BeforeClass
	public static void setup() {
		employee1 = new Staff("Blair","A","Files",new Date(),"address1","123-456-7897","email1","officehours1",1,23.45,new Date(),eTitle.MRS);
		employee2 = new Staff("Emma","T","Gaeje", new Date(),"address2","576-580-3026","email2","officehours2",2,45.67,new Date(),eTitle.MS);
		employee3 = new Staff("Jill","N","Hayden", new Date(),"address3","192-347-1987","email3","officehours3",3,2487.97,new Date(),eTitle.MS);
		employee4 = new Staff("Erica","E","Davis", new Date(),"address4","914-283-5673","email4","officehours4",4,236.32,new Date(),eTitle.MRS);
		employee5 = new Staff("Matt","A","Murphy", new Date(),"address5","382-937-8971","email5","officehours5",5,9683.34,new Date(),eTitle.MR);
		
		StaffList.add(employee1);
		StaffList.add(employee2);
		StaffList.add(employee3);
		StaffList.add(employee4);
		StaffList.add(employee5);
	
	
	}
	
	
	@Test
	public void SalaryTest() {
		double total = 0.0;
		
		for(Staff e : StaffList){
			total += e.getSalary();
		}
		
		double average = total/StaffList.size();
		assertEquals(average,2495.35);
	}	
	
	@Test(expected = PersonException.class)
	public void DOBTest() throws PersonException{
		Calendar newCalendar = java.util.Calendar.getInstance();
		newCalendar.set(Calendar.YEAR,2017);
		newCalendar.set(Calendar.MONTH,3);
		newCalendar.set(Calendar.DATE,20);
		Date newDate = newCalendar.getTime();
		
		try{
			employee1.setDOB(newDate);		
		}
		catch(Exception e){
			System.out.println("This is an invalid Date of Birth");
			e.printStackTrace();
		}
		
	@Test(expected = PersonException.class)
	public void PhoneNumberTest() throws PersonException{
		try {
			employee2.setPhoneNumber("576-580-3026");
			
		}
		catch (Exception e){
			System.out.println("This is an invalid phone number");
			e.printStackTrace();
		}
	}
		
	}
	
	

	

	

}
