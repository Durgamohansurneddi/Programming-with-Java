public class Break {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("pass");
            if(i==4){
                System.out.println("End");
                break;
            }
        }
    }
}
