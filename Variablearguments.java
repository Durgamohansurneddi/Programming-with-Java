public class Variablearguments {
    public static void main(String[] args) {
        // variable arguments(var args) is used to reduce the numbers of methods 
        //for example: in method overload it thas the same methodology but it has n no of methods to run so var args method is used to reduce the usage of methods
        System.out.println("Adding variable number of integers:");
        System.out.println(add(1,2));
        System.out.println(add(1,3,5,6));
        System.out.println(add());

        System.out.println(result(1));
        System.out.println(result(1,2,3,4));

    
    }
    //var args that will print even the null values without int
    static int add(int...num){
        int sum=0;
        for(int e:num){
            sum +=e;
        }
        return sum;
    }
    
    //var args that will need atleast one int to print
      static int result(int a, int... num) {
    int sum = a;              
    for (int e : num) {       
        sum += e;             
    }
    return sum;               
}
}
