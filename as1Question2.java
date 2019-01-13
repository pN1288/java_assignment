 import java.util.Scanner;
class Mychoice{
	static int GCD(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return GCD(a-b, b); 
        return GCD(a, b-a); 
    } 
    static int factorial(int a){
    	if(a==0)
    		return 1;
    	if(a==1)
    		return 1;
    	if(a<0)
    		return 0;
    	if(a>0)
    		return (a*factorial(a-1));
    return (a*factorial(a-1));
    }
	public static void main(String[] arg)
	{

    	Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number");
		int i = input.nextInt();
		System.out.println("Enter your second number");
		int j = input.nextInt();
		int gcd = GCD(i,j);
		System.out.println("GCD of " + i + " and " + j + " is " + gcd);
		System.out.println("Enter the number you want to take factorial");
		int k = input.nextInt();
		System.out.println("factorial of " +  k +  " is " + factorial(k));






	}
}
