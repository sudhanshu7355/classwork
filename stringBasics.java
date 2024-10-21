import java.util.*;

public class stringBasics {
    public static void main(String[] args) {
        String greeting="hello, my name is chandra";
        String response="hi";
        String arr[]=greeting.split(" ");
        System.out.println(arr[0]);
        greeting =String.join(" ",arr);
    }
}
