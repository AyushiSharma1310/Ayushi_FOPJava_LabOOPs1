package Department;

import Super.SuperDept;

public class HRDept extends SuperDept{
public  HRDept(String dept, String getTodaysWork, String getWorkDeadline) {
		
		super();
		dept = deptName;
		this.deptName= "Human Resource Department !!";
		getTodaysWork = getGetTodaysWork();
		this.getTodaysWork = "Fill today's Timesheet and Mark your Attendance";
		getWorkDeadline = getGetWorkDeadline();
		this.getWorkDeadline="Complete by EOD";
        doActivity();
		
        isTodayAHoliday=getIsTodayAHoliday();
        this.isTodayAHoliday = "Today is not a Holiday.";		
	}

public String doActivity() {
	// TODO Auto-generated method stub
	return"Team Lunch";
	
}
	

}
