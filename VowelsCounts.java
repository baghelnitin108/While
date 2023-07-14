import java.util.Scanner;

public class VowelsCounts {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        int count=0;

        while(l>0){
            char ch=str.charAt(l);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){

                count++;

                l--;

                
            }
        }System.out.println(count);

    }

   
    }
    
