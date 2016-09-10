import java.util.*;

public class repeatedelememnt {

    private static void repeatedelements(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[arr[i]] > 0)
                arr[arr[i]] = -arr[arr[i]];
            else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of elements");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        repeatedelements(arr);
    }
}
