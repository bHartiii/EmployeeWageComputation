import java.util.*;
public class EmployeeWageComputation
{       String attendance;
        String isPartTime;
        String companyName;
        float dailyWage=0;
        float monthlyWage=0;
        int totalWorkingDays=0;
        int totalWorkingHours=0;
        int workingHours=0;
        int WAGE_PER_HOURS;
        int FULL_DAY_HOURS;
        int PART_TIME_HOURS;
        int MAX_WORKING_HOURS;
        int MAX_WORKING_DAYS;

        public EmployeeWageComputation(String companyName,int wage,int fullDayHours,int partTimeHours,int maxWorkingHours,int maxWorkingDays){
                this.companyName=companyName;
                this.WAGE_PER_HOURS=wage;
                this.FULL_DAY_HOURS=fullDayHours;
                this.PART_TIME_HOURS=partTimeHours;
                this.MAX_WORKING_HOURS=maxWorkingHours;
                this.MAX_WORKING_DAYS=maxWorkingDays;
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
         public int getWorkingHours(){
                Random random=new Random();
                int isPartTime=random.nextInt(2);
                switch(isPartTime){
                        case 0:
                                workingHours=PART_TIME_HOURS;
                                break;
                        case 1:
                                workingHours=FULL_DAY_HOURS;
                                break;
                }
                return workingHours;
        }
        public float dailyWageCalculation(){
                if(attendance.equals("present")){
                     dailyWage=WAGE_PER_HOURS*workingHours;
                     totalWorkingHours=totalWorkingHours+workingHours;
                }
                else{
                        dailyWage=0;
                }
                return dailyWage;
        }
        public void monthlyWageCalculation(){
                while(totalWorkingDays!=MAX_WORKING_DAYS && totalWorkingHours!=MAX_WORKING_HOURS){
                        employeeAttendance();
                        getWorkingHours();
                        dailyWage=dailyWageCalculation();
                        monthlyWage=monthlyWage+dailyWage;
                        totalWorkingDays++;
                }
                System.out.println("Company Name - "+companyName);
                System.out.println("Total Working Days - "+totalWorkingDays);
                System.out.println("Total Working Hours - "+totalWorkingHours);
                System.out.println("Monthly Wage - "+monthlyWage );

        }
        public static void main(String args[])
        {
                EmployeeWageComputation dMart=new EmployeeWageComputation("DMart",30,16,8,320,20);
                dMart.monthlyWageCalculation();
        }
}

