import java.util.*;
public class EmployeeWageComputation
{       String attendance;
        String isPartTime;
        String employeeName;
        float dailyWage=0;
        float monthlyWage=0;
        int totalWorkingDays=0;
        int totalWorkingHours=0;

        static final int WAGE_PER_HOURS=20;
        static final int FULL_DAY_HOURS=8;
        static final int PART_TIME_HOURS=4;
        static final int MAX_WORKING_HOURS=160;
        static final int MAX_WORKING_DAYS=20;

        public EmployeeWageComputation(String employeeName){
                this.employeeName=employeeName;
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
        public String isPartTime(){
                Random random=new Random();
                int isPartTime=random.nextInt(2);
                switch(isPartTime){
                        case 0:
                                this.isPartTime="Yes";
                                break;
                        case 1:
                                this.isPartTime="No";
                                break;
                }
                return this.isPartTime;
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
        public void monthlyWageCalculation(){
                while(totalWorkingDays!=MAX_WORKING_DAYS && totalWorkingHours!=MAX_WORKING_HOURS){
                        employeeAttendance();
                        isPartTime();
                        dailyWage=dailyWageCalculation();
                        monthlyWage=monthlyWage+dailyWage;
                        totalWorkingDays++;
                }
                System.out.println("Employee Name - "+employeeName);
                System.out.println("Total Working Days - "+totalWorkingDays);
                System.out.println("Total Working Hours - "+totalWorkingHours);
                System.out.println("Monthly Wage - "+monthlyWage );

        }

        public static void main(String args[])
        {
                EmployeeWageComputation emp1=new EmployeeWageComputation("employee1");
                EmployeeWageComputation emp2=new EmployeeWageComputation("employee2");
                emp1.monthlyWageCalculation();
                emp2.monthlyWageCalculation();
        }
}


