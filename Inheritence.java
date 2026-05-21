public class Inheritence {
    public static void main(String[] args) {
        //it only prints the eat method 
        animal a=new animal();
        System.out.println("animal class method:");
        a.eat();

        //it prints both eat and bark method beacuse of inheritence
        dog d=new dog();
        System.out.println("dog class with extends animal class methods:");
        d.eat();
        d.bark();
        
    }   
}
class animal{
    public void eat(){
        System.out.println("eating...");
    }
}
class dog extends animal{//extends will help to inherit the properties of animal class to dog class
    public void bark(){
        System.out.println("barking...");
    }
}