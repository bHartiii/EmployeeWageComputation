import java.util.*;
public class CompanyBuilder{
	String companyName;
	int wagePerHour;
	int fullDayHours;
    	int partTimeHours;
	int maxWorkingHours;
	int maxWorkingDays;
	public CompanyBuilder(String companyName,int wagePerHour,int fullDayHours,int partTimeHours,int maxWorkingHours,int maxWorkingDays) {
    		this.wagePerHour=wagePerHour;
    		this.wagePerHour=wagePerHour;
    		this.fullDayHours=fullDayHours;
    		this.partTimeHours=partTimeHours;
    		this.maxWorkingHours=maxWorkingHours;
    		this.maxWorkingDays=maxWorkingDays;
    	}
	public static void main(String args[]){
		CompanyBuilder company1=new CompanyBuilder("DMart",20,8,4,160,20);
		CompanyBuilder company2=new CompanyBuilder("Reliance",10,8,4,160,20);

		new EmployeeWageComputation("employee1").monthlyWageCalculation(company1);
		new EmployeeWageComputation("employee2").monthlyWageCalculation(company2);

	}
}
