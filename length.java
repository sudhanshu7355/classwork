import java.util.*;
public class length {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int no=sc.nextInt();
        int length=0;
        while(no!=0){

            length=length+1;
            no=no/10;
        }
        System.out.println(length);
    }
}
