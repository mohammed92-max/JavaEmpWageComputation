public class EmployeeWageComputation
{
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	private final String company;
	private final int empRatePerHour;
	private final int numOfWorkingDays;
	private final int maxHoursPerMonth;
	private int totalEmpWage;
	
	public EmployeeWageComputationUC9(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}
	
	
	public void computeEmpWage()
	{	
		int empHrs=0,totalWorkingDays=0,totalEmpHrs=0;
				
		while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
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
			totalEmpHrs = totalEmpHrs + empHrs; 	
			System.out.println("Day "+totalWorkingDays+ " Emp Hr "+empHrs);
		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}
	
	@Override
	public String toString()
	{
		return "Total emp wage for company " +company+ " is "+totalEmpWage;
	}
	
	public static void main (String[] args)
	{
		EmployeeWageComputationUC9 BigBazaar = new EmployeeWageComputationUC9("BigBazaar",20,2,10);
		EmployeeWageComputationUC9 DMart = new EmployeeWageComputationUC9("DMart",20,2,10);
		
		BigBazaar.computeEmpWage();
		System.out.println(BigBazaar);	
		
		DMart.computeEmpWage();
		System.out.println(DMart);
	}
}
