import java.util.Scanner;
public class ifelse10 {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        char alp = sc.nextLine().charAt(0);
        if(num>0&&num<9)
            System.out.println("Digit");
        else if(alp>='a'&&alp<='z'||alp>='A'&&alp<='Z')
            System.out.println("Alphabet");
        else
            System.out.println("Special Character");
            sc.close();


    }
    
}
