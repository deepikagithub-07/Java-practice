import java.util.Scanner;
public class ifelse17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num1= sc.nextInt();
        if (num>=num1)
            System.out.println("greater than another");
        else if (num==num1)
            System.out.println("less than another");
        else{
            System.out.println("Not greater than another");
            sc.close();
        }
    }
} 