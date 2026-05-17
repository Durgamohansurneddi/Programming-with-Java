public class Methods {
    public static void main(String[] args) {
        String name="John";
        int age=25;
        //Calling the method to print the name and age of a person
        details(name, age);
        String result=details2(name, age);
        System.out.println(result);

    }
    //Method to call the name and age of a person
    static void details(String name, int age){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    //Method to print the name and age using return type
    static  String details2(String name,int age){
        return "name:"+name;

    }


}
