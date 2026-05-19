

public class Customclass {
    public static void main(String[] args) {
        employee person1=new employee();
        person1.id=1;
        person1.name="JAVA";
        person1.method();
        System.out.println("salary of"+person1.name+":" );
        System.out.println(person1.getsalary(20));
    }
}
class employee{
        int id;
        String name;
        int salary;

        public  void method(){
            System.out.println("Id:"+id);
            System.out.println("Name:"+name);
        }
        static int getsalary(int salary){
            return salary;
        }
    }
