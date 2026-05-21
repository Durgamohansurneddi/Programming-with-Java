public class Inheritencewithconstructors {
    public static void main(String[] args) {
        System.out.println("constructors with null values");
        System.out.println("numb");
        numb n=new numb();
        System.out.println("numb1");
        numb1 nu=new numb1();
        System.out.println("num2");
        num2 num=new num2();


        System.out.println("constructors with int values");
        System.out.println("numb");
        numb a=new numb(5);
        System.out.println("numb1");
        numb1 b=new numb1(5,10);
        System.out.println("num2");
        num2 c=new num2(5,10,15);
        
    }
}
class numb{

    public numb(){
        System.out.println("i am numb constructor");
    }
    public numb(int a){
        System.out.println("i am integer with value:"+a);
    }
}

class numb1 extends numb{

    public numb1(){
        System.out.println("i am numb1 constructor");
    }
    public numb1(int a,int b){
        super(a);//super keyword is used to call the constructors from the parent class which has 1 values 
        System.out.println("i am integer with value:"+b);
    }
}
class num2 extends numb1{
    public num2(){
        System.out.println("i am num2 constructor");
    }
    public num2(int a,int b,int c){
        super(a,b);//super keyword is used to call the constructors from the parent class which has 2 values 
        System.out.println("i am integer with value:"+c);
    }
}