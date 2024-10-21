import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        System.out.println("write a java program to print elements in odd positions");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if((i+1)%2!=0){
                System.out.println(arr[i]);

            }
        }
    }
}
