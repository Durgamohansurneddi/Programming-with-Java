import java.util.*;
public class Dowhile {
    public static void main(String[] args) {
        int a=10;
        do { 
            System.out.println(a);
            a++;
        } while (a<5);

        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int b=sc.nextInt();
        do { 
            System.out.println(b);
            b++;
        } while (b<a);
        sc.close();
    }
}
