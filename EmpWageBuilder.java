public class EmpWageBuilder {
	//CONSTANTS
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=0;
	public static final int EMP_RATE_PER_HRS=20;
	public static final int NUM_WORKING_DAYS=20;	
	public static final int MAX_HRS_IN_MONTH=100;

	public void callEmpWage() {
		//variables
		int empHrs=0;
		int empWage=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = ((int) Math.floor(Math.random() * 10)) % 3;

			switch(empCheck) {
				case IS_FULL_TIME:
					empHrs=8;
					break;
				case IS_PART_TIME:
					empHrs=4;
					break;
				default:
					empHrs=0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * EMP_RATE_PER_HRS;
			totalEmpWage += empWage;
		}
		System.out.println("Employee Wages for month : "+totalEmpWage);
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilder cmp = new EmpWageBuilder();
		cmp.callEmpWage();
	}
}
