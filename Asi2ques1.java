import java.util.Scanner;
class bill
{
	double phno;
	String name;
	double hire_charge;
	int unit_consumed;
	double bill_amount;

	public bill(double a, String nam , int b){

		a = phno;
		nam = name;
		b = unit_consumed;


	}
	public static void main(String[] args)
	{

		int unit_consumed;
		double bill_amount;
		double hire_charge;

		System.out.println("Enter your unit consumed..");
			Scanner in = new Scanner(System.in);
			 unit_consumed = in.nextInt();
			System.out.println("Enter the hire charge");
			hire_charge = in.nextInt();


		if(unit_consumed < 100)
		{
		bill_amount = hire_charge + 1*unit_consumed ;
		display(bill_amount);
	}
	else if(unit_consumed>100 && unit_consumed<200)
	{
		int rem_unit;
		rem_unit = unit_consumed - 100;
		bill_amount = hire_charge + 1*100 + 1.50*rem_unit ;
		display(bill_amount); 
	}
	else if(unit_consumed >200)
	{
		int in_rem_unit;
		in_rem_unit = unit_consumed - 200;
		bill_amount = hire_charge + 1*100 + 1.50*100 + 2 * in_rem_unit; 
		display(bill_amount);
	}

	}

	static void display(double final_bill)
	{
		System.out.println("Total bill is ...");
		System.out.println(final_bill);
	}
}
