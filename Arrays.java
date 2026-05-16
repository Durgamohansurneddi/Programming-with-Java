public class Arrays{
    public static void main(String[] args) {
         //we can intilaize an array in 3 ways
        //1st way
        int[] arr1 = new int[5];
        
        //2nd way
        int[] marks;
        marks=new int[5];

        //3rd way
        int[] arr3 = {10, 20, 30, 40, 50};

        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;

        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
        arr1[4]=50;

        System.out.println(marks[0]);
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);
    }
}