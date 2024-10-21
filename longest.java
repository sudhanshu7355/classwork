import java.util.*;

public class longest {
    public static void main(String[] args) {
        System.out.println("longest substring without repeating characters");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String largest=" ";
        String currentSubstring=" ";
        int start=0;
        int end=1;
        for(int i=0;i<str.length();i++){
            if(currentSubstring.indexOf(str.charAt(i))==-1){
                currentSubstring+=str.charAt(i);
            }
            else{
                if(largest.length()<currentSubstring.length()){
                    largest=currentSubstring;
                    i=start+1;
                    start++;
                }
                else{
                    currentSubstring="";
                    i=start+1;
                    start++;
                }
            }
        }

        System.out.println("Largest Substring: "+largest);
    }
}
