import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        System.out.println("write a program to print duplicate elements in an array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                   System.out.println(arr[i]);
                   break;
               }

            }
        }
    }
}
