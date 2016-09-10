
import java.util.*;


public class longestSum
{
	public static void main(String[] args)
	{
		int n,p,temp;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		arr[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		for(int j=i+1;j<n;j++)
		{
		if(arr[i]>arr[j])
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println(arr[i]);
			}
		}
	}
	

}
