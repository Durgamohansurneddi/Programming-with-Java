public class Typecasting {
    public static void main(String[] args) {
        //typecasting is the process of converting one data type into another data type
        //there are two types of typecasting: 1. implicit typecasting 2. explicit typecasting

        //implicit typecasting is the process of converting a smaller data type into a larger data type
        int a=10;
        double b=a; //implicit typecasting
        System.out.println(b);

        //explicit typecasting is the process of converting a larger data type into a smaller data type
        double c=20.5;
        int d=(int)c; //explicit typecasting
        System.out.println(d);

        float e=1.5f;
        int f=(int)e; //explicit typecasting
        System.out.println(f);

        char grade='A';
        grade=(char)(grade+5);
        System.out.println(grade);

        int ab=1;
        float cd=(float)(ab+0.5); //explicit typecasting
        System.out.println(cd);
    }
    
}
