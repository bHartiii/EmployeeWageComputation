import java.util.*;
public class EmployeeWageComputation
{       String attendance;
        String isPartTime;
	String empName;
        float dailyWage=0;
        float monthlyWage=0;
        int totalWorkingDays=0;
        int totalWorkingHours=0;
        int workingHours=0;

	public EmployeeWageComputation(String empName){
		this.empName=empName;
	}

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
         public int getWorkingHours(int partTimeHours,int fullDayHours){
                Random random=new Random();
                int isPartTime=random.nextInt(2);
                switch(isPartTime){
                        case 0:
                                workingHours=partTimeHours;
                                break;
                        case 1:
                                workingHours=fullDayHours;
                                break;
                }
                return workingHours;
        }
        public float dailyWageCalculation(int wagePerHour){
                if(attendance.equals("present")){
                     dailyWage=wagePerHour*workingHours;
                     totalWorkingHours=totalWorkingHours+workingHours;
                }
                else{
                        dailyWage=0;
                }
                return dailyWage;
        }
        public void monthlyWageCalculation(CompanyBuilder company){
                while(totalWorkingDays!=company.maxWorkingDays && totalWorkingHours!=company.maxWorkingHours){
                        employeeAttendance();
                        getWorkingHours(company.partTimeHours,company.fullDayHours);
                        dailyWage=dailyWageCalculation(company.wagePerHour);
                        monthlyWage=monthlyWage+dailyWage;
                        totalWorkingDays++;
                }
                System.out.println("Company Name - "+company.companyName);
                System.out.println("Total Working Days - "+totalWorkingDays);
                System.out.println("Total Working Hours - "+totalWorkingHours);
                System.out.println("Monthly Wage - "+monthlyWage );

        }
}

