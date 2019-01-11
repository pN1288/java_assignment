import java.util.Scanner;
class currency {
	String currencyCode;
	String currencyName;
	double exchangeRate;

	public currency(String c , String b, double a)
	{
		 c = currencyCode;
		 b = currencyName;
		 a = exchangeRate;

	}

		public currency()
		{
			String c = "IND";
			String b = "Rupee";
			double a = 70.32;
		}

		public static void main(String[] args)
		{
			String s;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string");
			s = sc.nextLine();
			System.out.println("Enter your amount");
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			calc(num , s);




		}

		static void calc(double amount, String currencyCode)
		{
			String string1 = "EUR";
			String string2 = "Dollar";
			String string3 = "pound";

			if(string1.equals(currencyCode))
				System.out.println(amount * 81.33);

			if(string2.equals(currencyCode))
				System.out.println(amount * 70.33);

			if(string3.equals(currencyCode))
				System.out.println(amount * 89.80);
			
		}

	}







