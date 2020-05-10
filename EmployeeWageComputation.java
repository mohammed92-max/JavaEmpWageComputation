import java.util.Scanner;

public class EmployeeWageComputation
{
	public static void main (String[] args)
	{
		int wagePerHour=20,totalHoursPerDay=8,fullTimeDailyWage;
		int partTimeEmp,partTimeWage,partTimeHour=8;

		System.out.println("1) Part time wage");
		System.out.println("2) Full time wage");

		Scanner scan = new Scanner(System.in);		
		System.out.println("Enter choice ");
		int choice = scan.nextInt();
		
		switch(choice)
		{

		case 1: int partTimeEmpDailyWage = partTimeHour * wagePerHour;
			System.out.println("Part time employee daily wage is "
                        +partTimeEmpDailyWage);
			break;

		case 2: fullTimeDailyWage = wagePerHour * totalHoursPerDay;
	                System.out.println("Daily wage is "+ fullTimeDailyWage);
			break;

		default: System.out.println("Invalid input");
			 break;
		}
	}
}






