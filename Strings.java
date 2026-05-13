import java.util.*;
public class Strings {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");

        String name1=sc.nextLine();// nextLine() method is used to read a line of text from the user. it will read the entire line of text including spaces.
        System.out.print(name1);

        String name2=sc.next();// next() method is used to read a single word from the user. it will read the first word of the input and ignore the rest of the input.
        System.out.print(name2);    

}
}
