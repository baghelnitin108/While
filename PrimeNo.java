import java.util.Scanner;
 
public class PrimeNo {
    public static void main(String[] args) {
        System.out.println("Enter a number to check Prime or Not");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 2, count = 0;
        while (i <= n/ 2) {
            if (n % i == 0) {
                count++;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("This is prime number");
        } else {
            System.out.println( " This is not a prime number");
        }
    }
}