import java.util.Scanner;

public class multiplicationNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
        int i=1;

        while(i<=m){
            if(i%n==0){
                System.out.println(i);
            }
            i++;
        }
    }


    
}
