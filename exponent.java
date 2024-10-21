import java.util.Scanner;

public class exponent {
    public static int power(int power){
        if(power==0){
            return 1;

        }
        return 2*power(power-1);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int power=sc.nextInt();
        while(power>=0) {

            int result = power(power);
            System.out.println(result);
            power--;
        }


    }
}
