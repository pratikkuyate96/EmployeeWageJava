class EmpWageBuilder {
	public static void main(String args[])
	{
		System.out.println("Welcome to Employee Wage Computation");
		//CONSTANTS
		int IS_FULL_TIME=1;
		int EMP_RATE_PER_HRS=20;
		int IS_PART_TIME=0;
		
		//variables
		int empHrs=0;
		int empWage=0;
		int empCheck=((int)Math.floor(Math.random()*10))%2; 
		if(empCheck==IS_FULL_TIME) 
		{
			empHrs=8;
		}
		else if(empCheck==IS_PART_TIME)
		{
			empHrs=4;
		}
		else
		{
			empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HRS;
		System.out.println("Emp Wage for "+empHrs+" hrs : "+empWage);
	}
}
