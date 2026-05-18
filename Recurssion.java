public class Recurssion {
    public static void main(String[] args) {
        //Recursion is a programming technique where a function calls itself in order to solve a problem. It typically involves a base case that stops the recursion and a recursive case that breaks the problem into smaller subproblems.
       
        System.out.println("Factorial of 5 is:"+fact(5));

    }
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
        }
 } 

