import java.util.Scanner;
public class ifelse13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num<=99)
            System.out.println("Two digit number");
        else{
            System.out.println("Not a two digit number");
            sc.close();
        }
    }
} 