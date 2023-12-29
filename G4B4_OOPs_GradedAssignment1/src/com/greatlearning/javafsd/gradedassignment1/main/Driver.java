package com.greatlearning.javafsd.gradedassignment1.main;

import com.greatlearning.javafsd.gradedassignment1.model.AdminDept;
import com.greatlearning.javafsd.gradedassignment1.model.HrDept;
import com.greatlearning.javafsd.gradedassignment1.model.TechDept;

public class Driver {
	public static void main(String args[]) {
		AdminDept 	a1 = new AdminDept();
		HrDept 		h1 = new HrDept();
		TechDept 	t1 = new TechDept();
		// Admin Department
		System.out.println("Welcome to " + a1.departmentName());
		System.out.println(a1.getTodaysWork());
		System.out.println(a1.getWorkDeadline());
		System.out.println(a1.isTodayAHoliday());
		System.out.println();
		//HR Department
		System.out.println("Welcome to " + h1.departmentName());
		System.out.println(h1.doActivity());
		System.out.println(h1.getTodaysWork());
		System.out.println(h1.getWorkDeadline());
		System.out.println(h1.isTodayAHoliday());
		System.out.println();
		//Tech Department
		System.out.println("Welcome to " + t1.departmentName());
		System.out.println(t1.getTodaysWork());
		System.out.println(t1.getWorkDeadline());
		System.out.println(t1.getTechStackInformation());
		System.out.println(t1.isTodayAHoliday());
		System.out.println();
	}
}