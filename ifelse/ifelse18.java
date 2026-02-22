import java.util.Scanner;
public class ifelse18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int num1= sc.nextInt();
        if (num>num1)
            System.out.println("num1 is smaller ");
        
        else{
            System.out.println("num is smaller");
            sc.close();
        }
    }
} 