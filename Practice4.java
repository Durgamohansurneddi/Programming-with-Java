public class Practice4 {
    public static void main(String[] args) {
        
        //creating an array of float type and calculating the sum of its elements
        float[] arr1=new float[5];
        arr1[0]=0.5f;
        arr1[1]=1.5f;
        arr1[2]=2.5f;
        arr1[3]=3.5f;
        arr1[4]=4.5f;

        float sum=0;

        System.out.println("Elements of float array:");
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            sum=sum+arr1[i];
        }
        System.out.println("Sum of elements: " + sum);

        //Printing the elements of an integer array in reverse order
        int[] arr2={10,20,30,40,50};
        System.out.println("Elements of integer array (in reverse order):");
        for(int i=arr2.length-1;i>=0;i--){
            System.out.println(arr2[i]);
        }

        //Searching for an element in an array using for loop
        int req=20;
        System.out.println("Searching for element: " + req);
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]==req){
                System.out.println("Element found at index: " + i);
                break;
            }
        }


        //Searching for an element in an array using for-each loop
        System.out.println("Searching for element using for-each loop: " + req);
        for(int element:arr2){
            if(element==req){
                System.out.println("element found:"+element);
                break;
            }   
        }

        //Calculating the total and average marks of a student using an array
        int[] marks={80,95,85,90,98};
        int total=0;
        for(int i=0;i<marks.length;i++){
            total=total+marks[i];
        }
        System.out.println("Total marks: " + total);
        //Calculating the average marks
        float avg=total/(float)marks.length;
        System.out.println("Average marks: " + avg);

        //Adding two 2D arrays using nested for loop
        int[][] ar={{1,2,3},{4,5,6}};
        int[][] ar1={{7,8,9},{10,11,12}};
        int[][] sum1={{0,0,0},{0,0,0}};
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                sum1[i][j]=ar[i][j]+ar1[i][j];
                System.out.print(sum1[i][j]+" ");
            }
            System.out.println(" ");
        }


        System.out.println("Largest element in the array using for loop:");
        int[] arr3={1,2,3,4,5};
        int temp=0;
        for(int i=0;i<arr3.length;i++){
            if(temp<arr3[i]){
                temp=arr3[i];
            }  
        }
        System.out.println("Largest element in the array: " + temp);

        System.out.println("Smallest element in the array using for loop:");
        for(int i=0;i<arr3.length;i++){
            if(temp>arr3[i]){
                temp=arr3[i];
            }
        }
        System.out.println("Smallest element in the array: " + temp);


        System.out.println("Largest element in the array using for-each loop:");
        for(int element:arr3){
            if(temp<element){
                temp=element;
            }
        }
        System.out.println("Largest element in the array: " + temp);



        System.out.println("Smallest element in the array using for-each loop:");
        for(int e:arr3){
            if(temp>e){
                temp=e;
            }
        }
        System.out.println("Smallest element in the array: " + temp);

        //sorting an array using for loop
        System.out.println("Sorting an array in ascending order using for loop:");
        int[] arr4={5,4,3,2,1};
        for(int i=0;i<arr4.length;i++){
            for(int j=0;j<arr4.length-1;j++){
                if(arr4[j]>arr4[j+1]){
                    int temp1=arr4[j];
                    arr4[j]=arr4[j+1];
                    arr4[j+1]=temp1;
                }
            }
        }
        for(int i=0;i<arr4.length;i++){
            System.out.print(arr4[i]+" ");
        }


    }
}
