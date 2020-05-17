package UC13;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage
{
	public static final int PART_TIME = 1;
	public static final int FULL_TIME = 2;
	
	//private int numOfCompany=0;
	private LinkedList<CompanyEmpWage> companyEmpWageList;
	private Map<String,CompanyEmpWage> companyToEmpWageMap;
	
	int[] dailyWageArray = new int[30];
	
	public EmpWageBuilder()
	{
		companyEmpWageList = new LinkedList<>();
		companyToEmpWageMap = new HashMap<>();
	}
	
	public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
	{
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		companyEmpWageList.add(companyEmpWage);
		companyToEmpWageMap.put(company,companyEmpWage);
	}
	
	public void computeEmpWage()
	{
		for(int i=0; i< companyEmpWageList.size(); i++)
		{
			CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
			companyEmpWage.setDailyEmpWage(this.computeEmpWage(companyEmpWage));
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			
			System.out.println(companyEmpWage);
		}
	}
	
	public int getTotalWage(String company)
	{
		return companyToEmpWageMap.get(company).totalEmpWage;
	}
	
	public int computeEmpWage(CompanyEmpWage companyEmpWage)
	{
		int empHrs=0,totalWorkingDays=0,totalEmpHrs=0,dailyEmpWage=0, i=0;
		
		while(totalEmpHrs<= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays)
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
			dailyWageArray[i] = empHrs*companyEmpWage.empRatePerHour;
			
			System.out.println("Day "+totalWorkingDays+ " Emp Hr "+empHrs);
			System.out.println("Daily emp wage is "+dailyWageArray[i]);
			i++;
		}
		companyEmpWage.totalEmpWage = totalEmpHrs * companyEmpWage.empRatePerHour;
		return companyEmpWage.totalEmpWage + dailyWageArray[i];	
		// gives total wage				
	}
	
	public static void main(String[] args)
	{
		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		
		empWageBuilder.addCompanyEmpWage(" DMart",20,2,10);
		empWageBuilder.addCompanyEmpWage(" Reliance",10,4,20);
		empWageBuilder.computeEmpWage();
	}
}


