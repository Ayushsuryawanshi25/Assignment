import java.util.*;


public class Max{
public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i= 0; i<n ;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int j=0 ; j<n; j++){
            if(arr[j]>max){
                max=arr[j];
            }
         }
        System.out.println("the largest number is "+ max);
    }

  }






