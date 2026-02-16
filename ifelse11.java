 import java.util.Scanner;
public class ifelse11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>=90){
            System.out.println("A grade");
        }
        
         else if(num>=75)
        {
            System.out.println("B grade");
        }
        else if(num>=60)        
        {
            System.out.println("C grade");
        }
        else 
        {
            System.out.println("Fail");
        }
             sc.close();
        }
        
    
}
    

