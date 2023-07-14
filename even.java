import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        System.out.println("Enter to check even Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;

        while(i<=n){
            if(i%2==0){
                System.out.println(i);

            }
            i++;
        }
    }
    
}
