public class Gettersandsetters{
    public static void main(String[] args) {
        empo mohan=new empo();
        mohan.setId(1);
        mohan.setName("java");
        System.out.println(mohan.getId());
        System.out.println(mohan.getName());
        
    }
}
class empo{
    private int id;
    private String name;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}