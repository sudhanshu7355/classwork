import java.util.Arrays;
import java.util.Scanner;

public class smallest {
    public static void main(String[] args) {
        System.out.println("find smallest distance between two neighbouring arrays");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int ans=arr[1]-arr[0];
        System.out.println(ans);
        int index1=0;
        System.out.println(index1);


    }
}
