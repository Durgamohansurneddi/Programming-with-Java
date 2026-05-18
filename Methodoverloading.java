public class Methodoverloading {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        System.out.println("Adding two integers:");
        System.out.println(add(a,b));
        System.out.println("Adding three integers:");
        System.out.println(add(a,b,c));
    }
    //Method to add two integers
    //method overloading is like methods with the same name but having different parameters 
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    
}
