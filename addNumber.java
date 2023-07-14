import java.util.Scanner;

public class addNumber {
    public static void main(String[] args) {
        System.out.println("Enter Digit for Sum");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        while(n>0){
            int digit=n%10;
            n=n/10;
            sum=sum+digit;

            
        }
        System.out.println(sum);
    }
    
}
