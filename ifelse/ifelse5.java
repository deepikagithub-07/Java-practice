import java.util.Scanner;
public class ifelse5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%4==0)
            System.out.println("Leap Year");
        else{
            System.out.println("Not a Leap Year");
            sc.close();
        }
    }
}