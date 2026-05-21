public class Methodoverriding {
    public static void main(String[] args) {
        animal1 a=new animal1();
        System.out.println("animal class");
        a.eat();//this will call the eat method of animal class
        System.out.println("\n");
        dog1 d=new dog1();
        System.out.println("dog class");
        d.eat();//this will call the eat method of dog class because of method overriding
        d.bark();
        
    }
}
class animal1{
    public void eat(){
        System.out.println("this is animal eating");
    }
}
class dog1 extends animal1{
    @Override
    public void eat(){//method overriding is the process of redefining the method of parent class in child class with same name and same parameters
        System.out.println("this is dog eating");
    }
    public void bark(){
        System.out.println("barking");
    }
}