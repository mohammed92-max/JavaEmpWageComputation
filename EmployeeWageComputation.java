public class EmployeeWageComputation
{
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	public static void callEmpWage(String company,int wagePerHour,int totalWorkDays,int empMaxHrs)
	{	
		int empHrs=0,days=1,dailyWage,totalWage=0,totalEmpHrs=0;
				
		while(totalEmpHrs<=empMaxHrs && days<=totalWorkDays)
		{
			days++;
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
			dailyWage = empHrs * wagePerHour;
			totalEmpHrs = totalEmpHrs + empHrs; 
			totalWage = totalWage + dailyWage;
		}	
		System.out.println("Total Wage of an employee for "+empMaxHrs+ " hours is "+totalWage);
	}
	
	public static void main (String[] args)
	{
		callEmpWage("Big Bazaar",10,20,160);
		callEmpWage("D Mart",20,25,200);
		callEmpWage("Wall Mart",30,30,150);
	}
}
