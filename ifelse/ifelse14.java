import java.util.Scanner;
public class ifelse14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>100)
            System.out.println("Greater than 100");
        else{
            System.out.println("less than 100");
            sc.close();
        }
    }
} 