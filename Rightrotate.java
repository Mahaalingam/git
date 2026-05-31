import java.util.*;
import java.util.Arrays;
public class Rightrotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int arr1[]=new int[n];
        int ind=0;
        for(int i=k+1;i<n;i++){
            arr1[ind++]=arr[i];
        }
        for(int i=0;i<=k;i++){
            arr1[ind++]=arr[i];

        }
        System.out.println(Arrays.toString(arr1));
        sc.close();
    }

}
