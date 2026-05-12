public class Precedence {
    public static void main(String args[]){
        int b=6*5-30/2; 
        // now the expression will use precedence of operators to solve the expression. like *,/ has higher precedence than +,-.
        //  so first it will solve 6*5 and 30/2 then it will solve the remaining expression.
        System.out.println(b);
    }
    
}
