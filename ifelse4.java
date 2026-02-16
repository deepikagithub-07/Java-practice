import java.util.Scanner;
public class ifelse4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int b = num.nextInt();
        int c = num.nextInt();
        if(a<b&&c<b){
            System.out.println("b is bigger");
        }
        else if(a<c&&b<c){
            System.out.println("c is bigger");
        }
        else{
    System.out.println("a is bigger");}
    num.close();
    }
    
}

    

