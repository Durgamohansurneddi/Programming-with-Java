import java.util.*;
public class Practice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=500;

        System.out.println("Enter marks of 5 subjects:");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();
        int sub4=sc.nextInt();
        int sub5=sc.nextInt();
         
        int total=sub1+sub2+sub3+sub4+sub5;

        int percentage=(total*100)/max;
        System.out.println("percentage of student:"+percentage);
    }
}