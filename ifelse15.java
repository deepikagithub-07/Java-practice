import java.util.Scanner;
public class ifelse15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        if (salary>50000)
            System.out.println(salary*10/100);
        else{
            System.out.println(salary*5/100);
            sc.close();
        }
    }
} 