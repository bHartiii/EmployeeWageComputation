import java.util.*;
public class CompanyBuilder
{
	String companyName;
	int wagePerHour;
	int fullDayHours;
    	int partTimeHours;
	int maxWorkingHours;
	int maxWorkingDays;
	public CompanyBuilder(String companyName,int wagePerHour,int fullDayHours,int partTimeHours,int maxWorkingHours,int maxWorkingDays) {
    		this.companyName=companyName;
		this.wagePerHour=wagePerHour;
    		this.wagePerHour=wagePerHour;
    		this.fullDayHours=fullDayHours;
    		this.partTimeHours=partTimeHours;
    		this.maxWorkingHours=maxWorkingHours;
    		this.maxWorkingDays=maxWorkingDays;
    	}
	public static void main(String args[]){
		CompanyBuilder[] companies=new CompanyBuilder[3];
		companies[0]=new CompanyBuilder("DMart",10,10,4,200,20);
		companies[1]=new CompanyBuilder("Reliance",20,16,8,400,25);
		companies[2]=new CompanyBuilder("Bridgelabz",30,20,10,560,28);
		new EmployeeWageComputation("employee1").monthlyWageCalculation(companies);

	}
}
