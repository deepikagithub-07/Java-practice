import java.util.Scanner;
public class ifelse3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        if(a<b){
            System.out.println("a is smaller than b");
        }
        else{
    System.out.println("b is smaller than a");}
    num.close();
    }
    
}
