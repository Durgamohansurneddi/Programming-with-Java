public class Practice6 {
    public static void main(String[] args) {
        System.out.println("hello");
        //getsalary and getname
        emp det=new emp();
       System.err.println( "name:"+det.getname("java"));
        System.out.println("salary"+det.getsal(20));

        //methods of cellphone
        cellphone vivo=new cellphone();
        vivo.calling();
        vivo.Ringing();
        vivo.vibrating();

        //square methods
        square squ=new square();
        System.out.println("area of square:"+squ.area(4));
        System.out.println("perimeter of square:"+squ.perimeter(4));

    }
}
//to intilize salary and name , add get salary and getname methods uisng methods and objects in oops
class emp{
    String name;
    int sal;

static int getsal(int sal){
    return sal;
}
static String getname(String name){
    return name;
}
}

//create a class cellphone to print vibrating,calling,ringing statements using methods and objects in oops
class cellphone{

    void vibrating(){
        System.out.println("phone is vibrating");
    }
    void Ringing(){
        System.out.println("phone is ringing");
    }
    void calling(){
        System.out.println("calling to friend");
    }

}

//calculate the area and perimeter of a square using methods and objects in oops
class square{
    int side;

    static int area(int side){
           return side*side;
    }
    static int perimeter(int side){
        return 4*side;
    }
}
