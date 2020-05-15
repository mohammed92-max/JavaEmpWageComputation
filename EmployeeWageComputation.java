public class EmployeeWageComputation
{
	public static final int FULL_DAY_HOUR = 8;
	public static final int WAGE_PER_HOUR = 20;
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	public static void callEmpWage()
	{	
		int dailyWage=0,totalWage=0,empHrs=0,totalEmpHrs=0,totalWorkDays=0;
		
		while(empHrs<=100 && totalWorkDays<=20)
		{
			totalWorkDays++;
			int checkEmp = (int)Math.floor(Math.random()*10) % 3;																	
			switch(checkEmp)
	        {
	        	case PART_TIME:
	         			empHrs=4;
	                 	break;
	            case FULL_TIME:
	                    empHrs=8;
	                 	break;
	            default:
	                 	empHrs=0;
	        }
			dailyWage = empHrs * WAGE_PER_HOUR;
			totalWage = totalWage + dailyWage;
			totalEmpHrs = totalEmpHrs + empHrs; 
		}	
		System.out.println("Total Wage of an employee for 20 days is "+totalWage);
	}
	
	public static void main (String[] args)
	{
		callEmpWage();
	}
}
