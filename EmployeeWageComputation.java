import java.util.*;
public class EmployeeWageComputation
{	static String attendance;
	static String isPartTime;
	static final int wagePerHour=20;
	static final int fullDayHour=8;
	static final int partTimeHour=4;
	static float dailyWage;
	public String employeeAttendance()
	{
		Random random=new Random();
	        int isPresent=random.nextInt(2);
		if(isPresent==0){
			EmployeeWageComputation.attendance="absent";
		}
		else{
			EmployeeWageComputation.attendance="present";
		}
	        return attendance;
	}
	public String isPartTime(){
		Random random=new Random();
		int isPartTime=random.nextInt(2);
		if(isPartTime==0){
			EmployeeWageComputation.isPartTime="Yes";
		}
		else{
			EmployeeWageComputation.isPartTime="No";
		}
		return EmployeeWageComputation.isPartTime;
	}
	public float dailyWageCalculation(){
		float dailyWage=0;
		if(attendance.equals("present")){
			if(isPartTime.equals("Yes")){
				dailyWage=wagePerHour*partTimeHour;
			}
			else{
				dailyWage=wagePerHour*fullDayHour;
			}
		}
		return dailyWage;
	}

	public static void main(String args[])
    	{
		EmployeeWageComputation empWage=new EmployeeWageComputation();
		empWage.employeeAttendance();
		empWage.isPartTime();
		dailyWage=empWage.dailyWageCalculation();
   		System.out.println("Daily Wage - "+dailyWage );
	}
}
