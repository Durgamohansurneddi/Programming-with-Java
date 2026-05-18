public class Practice5 {
    public static void main(String[] args) {

        //table
        System.out.println("table of a 5 :");
        multi(5);

        //pattern 
        System.out.println("the pattern:");
        pat(5);

        //pattern in reverse order
        System.out.println("pattern in reverse order:");
        pattern(5);

        //Sum of natural numbers using recusrive method
        System.out.println("sum of numbers:"+ add(5));

        //Repeat an number or pattern using recurssion
        System.out.println("repeating of an number or pattern:");
        repeat(4);
      
        //to print nth element of  fabonacci series
        System.out.println("the nth elemnet of fabonacci series:"+series(5));

        //to print avg using recurssive method
        System.out.println("avg of numbers:"+arg(1,25,67,89));

        //covert celius to farheneit
        System.out.println("convertion from celius to farheneit:"+convert(1)+"f");

        
    }

    //print a multipication of a number in using java methods
    static int multi(int a){
        int table=1;
        for(int i=1;i<=10;i++){
            table =a*i;
            System.out.printf("%d X %d = %d \n" , a,i,table);
        }
        return table;
    }
    //to print a pattern using functions;
    static  void pat(int b){
        for(int i=0;i<b;i++){
            for(int j=0;j<i+1;j++){ 
            System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //to print pattern in reverse order
    static void pattern(int b){
        for(int i=b;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    //recurssive method to calculate the sum of n natural numbers
    static int add(int c){
        if(c==1){
            return 1;
        }
        return c+add(c-1);
    }

    //Repeat a number or pattern  using recurssion
    static void repeat(int d ){
        for(int i=0;i<d;i++){
            System.out.print(" 4 ");
        }
        System.out.println();
    }

    //to print  nth element of fabinaocci series
    static int series(int e){
        if(e==1||e==2){
            return (e-1);
        }
        else{
            return series(e-1)+series(e-2);
        }
    }

    //to find average of numbers using variablearguments
    static float  arg(float ...pass){
        float sum=0;
        float n=pass.length;
        for(float e:pass){
            sum +=e;
        }
        return sum/n;
    }

    //covert celsius to farheneit
    static double  convert(double  f){
        if(f==0){
            return 32f;
        }
        else{
            return (f*9/5)+32;
        }
    }
}
