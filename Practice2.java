import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        

        int a=10;
        if(a==11){
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am "+ a);
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1 subject marks:");
        int s1=sc.nextInt();
        System.out.print("enter 2 subject marks:");
        int s2=sc.nextInt();
        System.out.println("enter 3 subject marks:");
        int s3=sc.nextInt();

        float avg=(float)(s1+s2+s3)/3.0f;

        if(avg>40.0f && s1>33 && s2>33 && s3>33){
            System.out.println("Pass");
        }
        else{
            System.out.println("fail");
        }

        System.out.println("enter the tax:");
        float tax=sc.nextFloat();
        if(tax<2.5f){
            System.out.println("no tax");
        }
        else if(tax>2.5f && tax<=5){
            System.out.println("2% tax");
        }
        else if(tax>5 && tax<=10){
            System.out.println("4% tax");
        }
        else{
            System.out.println("7% tax");
        }

        System.out.println("Enter the no of day:");
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("invalid number of day");
        }



    }
}
