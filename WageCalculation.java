import java.util.*;
interface WageCalculation{
	public String employeeAttendance();
	public int getWorkingHours(int partTimeHours,int fullDayHours);
	public float dailyWageCalculation(int wagePerHour);
	public void monthlyWageCalculation(ArrayList object);
}
