public class Displayofarray {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        //Their are 2 ways to display the elements of an array
            //1st way using for loop
            System.out.println("Using for loop:");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        //2nd way using for-each loop
        System.out.println("Using for-each loop:");
        for(int element:arr){
            System.out.println(element);
        }

        //printing the array in reverse order
        System.out.println("Array in reverse order:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
