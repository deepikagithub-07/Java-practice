import java.util.Scanner;
public class ifelse20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2==0)
            System.out.println("Yes divisible by 2");
        else{
            System.out.println("Not divisible by 2");
            sc.close();
        }
    }
}