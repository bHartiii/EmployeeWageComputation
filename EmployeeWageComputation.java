import java.util.*;
public class EmployeeWageComputation
{	static int isPresent;
	public int employeeAttendance()
	{
		Random random=new Random();
	        int isPresent=random.nextInt(2);
	        return isPresent;
	}
	public static void main(String args[])
    	{
		EmployeeWageComputation empWage=new EmployeeWageComputation();
		isPresent=empWage.employeeAttendance();
		System.out.println(isPresent);
   	}
}
