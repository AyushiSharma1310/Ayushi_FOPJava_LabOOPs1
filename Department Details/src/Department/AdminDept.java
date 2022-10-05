package Department;

import Super.SuperDept;

public class AdminDept extends SuperDept {

	public  AdminDept(String dept, String getTodaysWork, String getWorkDeadline) {
		
		super();
		dept=deptName;
		this.deptName="Administrative Department !!";
		getTodaysWork=getGetTodaysWork();
		this.getTodaysWork="Complete your documents submission";
		getWorkDeadline = getGetWorkDeadline();
		this.getWorkDeadline= "Complete by EOD";
			
		
		 isTodayAHoliday=getIsTodayAHoliday();
	        this.isTodayAHoliday = "Today is not a Holiday.";		
		
		}

		
	}
	

