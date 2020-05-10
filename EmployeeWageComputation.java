public class EmployeeWageComputation
{
	public static void main (String[] args)
	{
		int wagePerHour=20,totalHoursPerDay=8,dailyWage;
		int partTimeEmp,partTimeWage,partTimeHour=8;

		dailyWage = wagePerHour * totalHoursPerDay;
		int partTimeEmpDailyWage = partTimeHour * wagePerHour;

		System.out.println("Daily wage is "+ dailyWage);
		System.out.println("Part time employee daily wage is "
				    +partTimeEmpDailyWage);
	}
}






