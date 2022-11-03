import java.util.Scanner;

public class CountNoOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        int number=n;

        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of digits present in " + number + " = " + count);
    }
}
