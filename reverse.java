import java.io.*;
import java.util.*;
class reverse{
public static void main(String args[]){
String a,b="";
int i,n;
Scanner sc=new Scanner(System.in);
a=sc.nextLine();
n=a.length();
for(i=n-1;i>=0;i--){
b=b+a.charAt(i);
}

System.out.println(b);

}
}
