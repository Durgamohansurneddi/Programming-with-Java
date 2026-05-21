public class Dyanmicmethods {
    public static void main(String[] args) {
        //it is used to call the method of child class using parent class reference variable at runtime
        //dynamic method dispatch is the process of calling the method of child class using parent class reference variable at runtime

        phone p=new smartphone();
        p.greet();
        p.name();//this will call the name method of smartphone class because of method overriding
       // p.on();//this will not call the on method of smartphone class because of dynamic method dispatch as it is was not overriden from phone classs
        
    }
}
class phone{
    public void greet(){
        System.out.println("good morning");
    }
    public void name(){
        System.out.println("hey");
    }
}
class smartphone extends phone{
    public void on(){
        System.out.println("turning on the phone");
    }
    @Override
    public void name(){
        System.out.println("hello");
    }
}
