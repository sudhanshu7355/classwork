import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        System.out.println("calculate for two values");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        char expression=sc.next().charAt(0);
        int result;
        switch (expression){
            case '+':
                result=a+b;
                System.out.println(result);
                break;

            case '-':
                result=a-b;
                System.out.println(result);
                break;

            case '*':
                result=a*b;
                System.out.println(result);
                break;

            case '/':
                result=a/b;
                System.out.println(result);
                break;

            default:
                System.out.println("invalid");
                break;


        }
    }
}
