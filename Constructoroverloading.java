

public class Constructoroverloading {
    public static void main(String[] args) {
        school stu=new school();
        school st=new school(101,"java");
        school s=new school("ranveer");
        stu.display();
        st.display();
        s.display();
        
    }
}
class school{
    private int id;
    private String name;

    public school(){
        this.id=id;
        this.name=name;
    }
    public school(int id,String name){
        this.id=id;
        this.name=name;
    }
    public school(String name){
        this.name=name;
    }
    public void display(){
        System.out.println(" id: "+id+" name: "+name);
    }
}
