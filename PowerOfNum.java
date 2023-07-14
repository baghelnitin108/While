import java.util.Scanner;

public class PowerOfNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in );
        int n=sc.nextInt();
        int m=sc.nextInt();
        int o=1;
        int i=1;
        
        while(i<=m){
            o=n*o;

            i++;
        }
        System.out.println(o);
    }
    

}
