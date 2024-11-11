import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int no=sc.nextInt();
        int length=0;



         int temp1=no;
        while(temp1!=0){
            length=length+1;
            temp1=temp1/10;
        }
        int temp2=no;
        int rem;
        int sum=0;
        while(temp2!=0){
            rem=temp2%10;
            temp2=temp2/10;
            int mul=1;
            for(int i=1;i<=length;i++){
                mul=mul*rem;
            }
            sum=sum+mul;


        }
        if(no==sum){
            System.out.println("it is armstrong no");
        }
        else{
            System.out.println("not armstrong");
        }


    }
}
