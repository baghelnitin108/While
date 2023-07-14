import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        System.out.println("Enter check to Febonacci ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ft=0;
        int st=1;

        while(n>0){
            int tt=ft+st;
            System.out.println(ft);

            ft=st;
            st=tt;

            n--;
        }
    }
    
}
