import java.util.*;
import java.util.Arrays;
public class moveallzeroinend {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ind=0;
        int arr1[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr1[ind++]=arr[i];
            }
        }
          System.out.println(Arrays.toString(arr1));
    }
    
}
