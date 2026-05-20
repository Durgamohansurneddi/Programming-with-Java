

public class Constructors {
    public static void main(String[] args) {
        School stu=new School();
        stu.display();
        
    }
}
class School{
   private  int id;
   private String name;

   public School(){//constructor will have same class name 
   // this.id=id;
   // this.name=name;

    this.id=1;
    this.name="java";
   }
   public void display(){
    System.out.println("id:"+id);
    System.out.println("name:"+name);
   }


}
