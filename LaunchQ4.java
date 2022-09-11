import java.util.Scanner;

public class LaunchQ4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n=sc.nextInt();	
		for(int i=0;i<n;i++)
		{
				
			for(int j=0;j<n;j++)
			{
				if(i-j>(n-1)/2||i+j>=n+(n-1)/2)
	              System.out.print("*");
				else
					System.out.print(" ");
	              
			}                                                     
			System.out.println();
		}

	}

}import java.util.Scanner;

public class LaunchQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int n=sc.nextInt();	
		for(int i=0;i<n;i++)
		{
				
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||j==n-1||i==n-1||i<n/2-j||j>=n/2+i-1)
					
	              System.out.print("*");
				else
					System.out.print(" ");
	              
			}
			System.out.println();
		}

	}

}