import java.util.Scanner;
public class ifelse8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>18){
            System.out.println("eligible to vote");
        }
        
        else{
            System.out.println("not eligible to vote");
             sc.close();
        }
        }
    }
    
