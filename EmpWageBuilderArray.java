public class EmpWageBuilder 
{
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	private int numOfCompany = 0;
	private CompanyEmpWage[] EmployeeWageComputationUC10Array;
	
	public EmpWageBuilder()
	{
		EmployeeWageComputationUC10Array = new CompanyEmpWage[5];
	}
	
	private void addEmployeeWageComputationUC10(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		EmployeeWageComputationUC10Array[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	
	private void computeEmpWage()
	{
		for(int i=0; i<numOfCompany; i++)
		{
			EmployeeWageComputationUC10Array[i].setTotalEmpWage(this.computeEmpWage(EmployeeWageComputationUC10Array[i]));
			System.out.println(EmployeeWageComputationUC10Array[i]);
		}
	}
	
	private int computeEmpWage(CompanyEmpWage employeeWageComputationUC10)
	{
		int empHrs=0,totalWorkingDays=0,totalEmpHrs=0;
		
		while(totalEmpHrs<= employeeWageComputationUC10.maxHoursPerMonth && totalWorkingDays < employeeWageComputationUC10.numOfWorkingDays)
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
		return totalEmpHrs * employeeWageComputationUC10.empRatePerHour;
	}
	
	public static void main (String[] args)
	{
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addEmployeeWageComputationUC10("BigBazaar",20,22,176);
		empWageBuilder.addEmployeeWageComputationUC10("DMart",10,22,198);
		empWageBuilder.computeEmpWage();
	}
}

