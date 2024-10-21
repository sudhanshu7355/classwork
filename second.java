import java.util.*;
public class second {
    public static void main(String[] args) {
        System.out.println("second largest element in an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr.length-1);

        }
    }

