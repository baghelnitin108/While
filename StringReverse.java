import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String ans="";
        int i=str.length()-1;

        while(i>=0){
            char ch=str.charAt(i);
            ans=ans+ch;

            i--;
        }
        System.out.println(ans);
    }
}