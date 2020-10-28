import java.util.*;
public class EmployeeWageComputation
{	static String attendance="";
	static final int wagePerHour=20;
	static final int fullDayHour=8;
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
	public float dailyWageCalculation(){
		float dailyWage=0;
		if(attendance.equals("present")){
			dailyWage=wagePerHour*fullDayHour;
		}
		return dailyWage;
	}
	public static void main(String args[])
    	{
		EmployeeWageComputation empWage=new EmployeeWageComputation();
		empWage.employeeAttendance();
		dailyWage=empWage.dailyWageCalculation();
   		System.out.println("Daily Wage - "+dailyWage );
	}
}
