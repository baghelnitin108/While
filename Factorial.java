import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter Number to check Factorial NO.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=1;
        while(n>0){
            ans=ans*n;
            n--;
        }System.out.println(ans);
    }
    
}
