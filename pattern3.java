public class pattern3 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
