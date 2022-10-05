package Department;

import Super.SuperDept;

public class TechDept extends SuperDept{
	
public  TechDept(String dept, String getTodaysWork, String getWorkDeadline) {
		
		super();
		dept=deptName;
		this.deptName = "Technical Department !!";
		getTodaysWork=getGetTodaysWork();
		this.getTodaysWork="Complete coding of Module 1";
		getWorkDeadline=getGetWorkDeadline();
		this.getWorkDeadline="Complete by EOD";
		getTechStackInformation();
		
		 isTodayAHoliday=getIsTodayAHoliday();
	        this.isTodayAHoliday = "Today is not a Holiday.";		
				
	}

public String getTechStackInformation() {
	// TODO Auto-generated method stub
	return "Core Java";
	
}

}
