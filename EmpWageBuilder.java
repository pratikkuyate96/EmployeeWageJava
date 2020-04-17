public class EmpWageBuilder {
	//CONSTANTS
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=0;
	public static int EMP_RATE_PER_HRS;
	public static int NUM_WORKING_DAYS;
	public static int MAX_HRS_IN_MONTH;
	public static int TOTAL_EMP_WAGE;

	public EmpWageBuilder(int EMP_RATE_PER_HRS,int NUM_WORKING_DAYS,int MAX_HRS_IN_MONTH)
	{
		this.EMP_RATE_PER_HRS=EMP_RATE_PER_HRS;
		this.NUM_WORKING_DAYS=NUM_WORKING_DAYS;
		this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
	}

	public static int getEmpRatePerHrs() {
		return EMP_RATE_PER_HRS;
	}

	public static int getMaxWorkingDays() {
		return MAX_WORKING_DAYS;
	}

	public static int getMaxHrsInMonth() {
		return MAX_HRS_IN_MONTH;
	}

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
			System.out.println("Day : " + totalWorkingDays + "Employee hours : " + empHrs);
		}
		TOTAL_EMP_WAGE = totalEmpHrs * getEmpRatePerHrs();
		return TOTAL_EMP_WAGE;
	}

	public static void main(String args[]) {
		System.out.println("Welcome to Employee Wage Computation");
		EmpWageBuilder bridgelabz = new EmpWageBuilder(20, 20, 100 );
		int wage1 = bridgelabz.callEmpWage();
		System.out.println("TOTAL EMPLOYEE WAGE FOR BRIDGELABZ : "+wage1);
		EmpWageBuilder capgminai= new EmpWageBuilder(50, 15, 75 );
		int wage2 = capgminai.callEmpWage();
		System.out.println("TOTAL EMPLOYEE WAGE FOR CAPGMINI : "+wage2);
	}
}
