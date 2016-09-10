import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class occursonce
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,i;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int []a=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
			
		}
		int []b=new int[n];
			for(i=0;i<n;i++){
			b[i]=0;
			}
			for(i=0;i<n;i++){
				
				b[a[i]]++;
			}
			
		for(i=0;i<n;i++){
			if(b[i]==1){
				System.out.println(a[i]);
			
			}
			/*else{
						System.out.println(a[i]);
			}*/
		}
		
	}
}
