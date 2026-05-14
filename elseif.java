public class elseif {
    public static void main(String[] args){
        int age=19;
        if(age>=18){
            System.out.println("you can vote");
        }
        else if(age>=16){
            System.out.println("you can drive");
        }
        else{
            System.out.println("you cannot vote or drive");
        }
    }
}
