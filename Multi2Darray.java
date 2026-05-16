public class Multi2Darray {
    public static void main(String[] args) {
        int [][] arr;
        arr=new int[2][3];
        arr[0][0]=1;
        arr[0][1]=2;
        arr[0][2]=3;
        arr[1][0]=4;
        arr[1][1]=5;
        arr[1][2]=6;

        //we will display the elements of 2D array using nested for loop
        System.out.println("Elements of 2D array:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }
}
