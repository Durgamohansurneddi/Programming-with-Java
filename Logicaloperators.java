public class Logicaloperators {
    public static void main(String args[]){
        int a=10;
        int b=20;
        int c=30;

        // Logical AND operator (&&)
        if(a<b && b>c){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        // Logical OR operator (||)
        if(a<b || b>c){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        // Logical NOT operator (!)
        if(!(a<b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
