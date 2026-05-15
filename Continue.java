public class Continue {
    public static void main(String args[]){
        for(int i=0;i<15;i++){
            System.out.println(i);
            System.out.println("yes");
            if(i==10){
                System.out.println("decade");
                continue;
            }
            if(i==12){
                System.out.println("no chance");
                break;
            }
        }
    }
}
