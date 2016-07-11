import java.io.*;
import java.util.*;
class factorial{
public static void main(String args[]){
int i,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
i=fact(n);
System.out.println(i);
}
public static int fact(int n){
if(n==0)
return 1;
else
return (n*fact(n-1));
}
}
