import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int og=n;

        while(n>0){
            int digit=n%10;

            int cube=digit*digit*digit;
            
            sum=sum+cube;
            n=n/10;

            
        }
        
        if(sum==og){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
    
}
