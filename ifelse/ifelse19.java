import java.util.Scanner;
public class ifelse19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
       
        if (num==30)
            System.out.println("hot");
        else if (num<30&&num>20)
            System.out.println("warm");
        else{
            System.out.println("cold");
            sc.close();
        }
    }
} 