import java.util.*;
public class EmployeeWageComputation
{	static String attendance;
	static String isPartTime;
	static final int wagePerHour=20;
	static final int fullDayHour=8;
	static final int partTimeHour=4;
	static float dailyWage=0;
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
