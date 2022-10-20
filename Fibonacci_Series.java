import java.util.*;
class fibonacci {
	static int fibo(int n)
	{   
	  if(n==0) return 0;
		if (n == 1 || n==2) return 1;
		
		return(fibo(n - 1) + fibo(n - 2));
	}

	public static void main(String[] args)
	{   
    Scanner ob= new Scanner(System.in);
		System.out.println("Enter the number of terms\n");
    int n=ob.nextInt();
    System.out.println("Fibonaci Series: \n");

		for (int i = 0; i < n; i++) 
            System.out.print(fibo(i) + " ");
	}
}
