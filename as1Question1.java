import java.util.Scanner;
class Mycl{
	public static void main(int[] arg)
	{
		int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
        setVal(a);
        System.out.println("Sum:"+sum);
	}


	void setVal(int a[])
	{
		int sum =0;
		for(int i=0; i<5 ; i++){

		sum = sum + a[i];
	}
	System.out.println("Sum:"+sum);
	}
	
	
}
