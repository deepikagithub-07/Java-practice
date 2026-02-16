import java.util.Scanner;
public class ifelse7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%7==0&&num%3==0)
            System.out.println("Divisible by 7 and 3");
        else{
            System.out.println("Not Divisible by 7 and 3");
            sc.close();
        }
    }
}