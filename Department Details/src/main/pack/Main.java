package main.pack;

import Department.AdminDept;
import Department.HRDept;
import Department.TechDept;



public class Main {

		
		public static void main(String[] args) {
			
			System.out.println();
			System.out.println();
						
			
			AdminDept ad = new AdminDept(null, null, null);

			System.out.println(" Welcome to " + " "+ ad.getDeptName());
			System.out.println(ad.getGetTodaysWork());
			System.out.println(ad.getGetWorkDeadline());
			System.out.println(ad.getIsTodayAHoliday());
			
			System.out.println();
			System.out.println();
			
			HRDept hr = new HRDept(null, null, null);
			
			System.out.println(" Welcome to " + " "+ hr.getDeptName());
			System.out.println(hr.getGetTodaysWork());
			System.out.println(hr.getGetWorkDeadline());
			System.out.println(hr.doActivity());
			System.out.println(hr.getIsTodayAHoliday());
			
			
			System.out.println();
			System.out.println();
			
			TechDept tc = new TechDept(null, null, null);
					
			System.out.println(" Welcome to " + " "+ tc.getDeptName());
			System.out.println(tc.getGetTodaysWork());
			System.out.println(tc.getGetWorkDeadline());
			System.out.println(tc.getTechStackInformation());
			System.out.println(tc.getIsTodayAHoliday());
		
	}
}
