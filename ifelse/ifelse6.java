import java.util.Scanner;
public class ifelse6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%5==0)
            System.out.println("Yes divisible by 5");
        else{
            System.out.println("Not divisible by 5");
            sc.close();
        }
    }
}