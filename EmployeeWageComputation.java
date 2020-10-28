import java.util.*;
public class EmployeeWageComputation
{	static String attendance;
	static String isPartTime;
	static final int WAGE_PER_HOURS=20;
	static final int FULL_DAY_HOURS=8;
	static final int PART_TIME_HOURS=4;
	static final int MAX_WORKING_HOURS=160;
	static float dailyWage=0;
	static final int MAX_WORKING_DAYS=20;
	static float monthlyWage=0;
	static int totalWorkingDays=0;
	static int totalWorkingHours=0;
	public String employeeAttendance()
	{
		Random random=new Random();
	        int isPresent=random.nextInt(2);
		switch(isPresent){
			case 0:
				attendance="absent";
				break;
			case 1:
				attendance="present";
				break;
		}
	        return attendance;
	}
	public String isPartTime(){
		Random random=new Random();
		int isPartTime=random.nextInt(2);
		switch(isPartTime){
			case 0:
				EmployeeWageComputation.isPartTime="Yes";
				break;
			case 1:
				EmployeeWageComputation.isPartTime="No";
				break;
		}
		return EmployeeWageComputation.isPartTime;
	}
	public float dailyWageCalculation(){
		if(attendance.equals("present")){
			if(isPartTime.equals("Yes")){
				dailyWage=WAGE_PER_HOURS*PART_TIME_HOURS;
				totalWorkingHours=totalWorkingHours+PART_TIME_HOURS;
			}
			else{
				 dailyWage=WAGE_PER_HOURS*FULL_DAY_HOURS;
				 totalWorkingHours=totalWorkingHours+FULL_DAY_HOURS;
			}
		}
		else{
			dailyWage=0;
		}
		return dailyWage;
	}

	public static void main(String args[])
    	{
		EmployeeWageComputation empWage=new EmployeeWageComputation();
		while(totalWorkingDays!=MAX_WORKING_DAYS && totalWorkingHours!=MAX_WORKING_HOURS){
			empWage.employeeAttendance();
			empWage.isPartTime();
			dailyWage=empWage.dailyWageCalculation();
			monthlyWage=monthlyWage+dailyWage;
			totalWorkingDays++;
		}
		System.out.println(totalWorkingDays);
		System.out.println(totalWorkingHours);
   		System.out.println("Monthly Wage - "+monthlyWage );
	}
}
