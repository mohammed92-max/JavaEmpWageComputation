import java.util.Scanner;

public class EmployeeWageComputation
{
	public static void main (String[] args)
	{
		int wagePerHour=20,totalHoursPerDay=8,fullTimeDailyWage=0;
		int partTimeEmp,partTimeWage,partTimeHour=8;
		int partTimeEmpDailyWage=0;

		System.out.println("1) Part time wage");
		System.out.println("2) Full time wage");

		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter choice ");
		int choice = scan.nextInt();
		
		switch(choice)
		{

		case 1: for(int i=1;i<=20;i++)
			{
	   		partTimeEmpDailyWage = partTimeEmpDailyWage + partTimeHour * wagePerHour;
			}

			System.out.println("Part time employee daily wage till 20 days are "
                        +partTimeEmpDailyWage);

			break;

		case 2: for(int j=1;j<=20;j++)
			{
			fullTimeDailyWage = fullTimeDailyWage + wagePerHour * totalHoursPerDay;
			}
			
	                System.out.println("Total daily wage till 20 days is "+ fullTimeDailyWage);
			break;

		default: System.out.println("Invalid input");
			 break;
		}
	}
}






