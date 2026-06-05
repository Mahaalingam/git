import java.util.*;
public class duplicateelement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Duplicate elements: ");
        boolean found = false;

        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.print(arr[i]+" ");
                found = true;
                while(i+1 < n-1 && arr[i]==arr[i+1]){
                    i++;
                }
            }
        }
        if(!found){
            System.out.println("No duplicates found");
        }

        sc.close();
    }
}