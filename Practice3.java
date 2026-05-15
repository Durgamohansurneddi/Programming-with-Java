public class Practice3 {
    public static void main(String[] args) {

        //star pattern decrement
        int a=4;
        for(int i=a;i>0;i--){
            for(int j=0;j<i;j++){
              System.out.print(i);
            }
            System.out.print("\n");
        }


        //star pattern increment
        int b=5;
        for(int i=0;i<b;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //while loop for sum of even numbers
        int d=0;
        int sum1=0;
        while(d<5){
            sum1=sum1+2*d;
            d++;
        }
        System.out.println("Sum of even numbers using while loop:");
        System.out.println(sum1);



        // for loop for sum of even numbers
        int e=5;
        int sum2=0;
        for(int i=0;i<e;i++){
            sum2=sum2+2*i;
        }
        System.out.println("Sum of even numbers using for loop:");
        System.out.println(sum2);

        //sum of odd numbers using while loop
        int odd=0;
        int sum3=0;
        while(odd<5){
            sum3=sum3+(2*odd+1);
            odd++;
        }
        System.out.println("sum of odd numbers using while loop:");
        System.out.println(sum3);


        //multiplication of n number using for loop
        System.out.println("Multiplication of a number in normal order:");
         int multi=5;
         int table=0;
         for(int i=1;i<=10;i++){
            table =multi*i;
            //System.out.println(i);
            //System.out.println(table);
            System.out.printf("%d x %d = %d", multi,i,table);
            System.out.println("\n");
         }

          //multiplication of n number using for loop in reverse order
          System.out.println("Multiplication of a number in reverse order:");
         int mult=5;
         int tabl=0;
         for(int i=10;i>=1;i--){
            table =multi*i;
            //System.out.println(i);
            //System.out.println(table);
            System.out.printf("%d x %d = %d", multi,i,table);
            System.out.println("\n");
         }


         //Factorail of number using for loop
         System.out.println("Factorial of a number using for loop:");
         int num=5;
         int fact=1;
         for(int i=1;i<=num;i++){
            fact *=i;
         }
         System.out.println(fact);

         //factorial of number using while loop
         System.out.println("Factorial of number using while loop:");
         int n=5;
         int fac=1;
         int x=1;
         while(x<5){
            fac *=x;
            x++;
         }System.out.println(fact);


         //sum of n number table using for loop
         System.out.println("Sum of n number table:");
         int muli=5;
         int tale=0;
         for(int i=1;i<=10;i++){
            tale +=muli*i;
            //System.out.println(i);
            //System.out.println(table);
         }
         System.out.println(tale);
            


}
}
