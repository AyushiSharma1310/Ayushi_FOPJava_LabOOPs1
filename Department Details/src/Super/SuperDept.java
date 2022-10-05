package Super;

public abstract class SuperDept {

	protected String deptName;
	protected String getTodaysWork;
	protected String getWorkDeadline;
	protected String isTodayAHoliday;
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getGetTodaysWork() {
		return getTodaysWork;
	}
	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return getWorkDeadline;
	}
	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	public String getIsTodayAHoliday() {
		return isTodayAHoliday;
	}
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
	
	public void Display() {
		System.out.println("Welcome to Super Department !!!");
		System.out.println("No Work as of Now");
		System.out.println("Nil");
		System.out.println("Today is not a Holiday");
	}
	
}
