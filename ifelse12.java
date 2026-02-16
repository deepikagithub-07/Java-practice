import java.util.Scanner;
public class ifelse12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>=99)
            System.out.println("Multiple of 10");
        else{
            System.out.println("Not a Multiple of 10");
            sc.close();
        }
    }
}