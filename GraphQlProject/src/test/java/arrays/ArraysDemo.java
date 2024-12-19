package arrays;

public class ArraysDemo {

    public static void main (String [] args) {

//        int a=4;
        //array- a container with multiple values of same data type

        int a[]=new int[5];//declares an array and allocates memory for the values
//        int b[]=new int[10];
        a[0]=2; //initiate values
        a[1]=22;
        a[2]=20;
        a[3]=19;
        a[4]=11;
   int b[] ={1,2,3,4,6,7};
   int b1[] ={1,2,3,4,6,7}; //test git
        // int b1[] ={1,2,3,4,6,7}; //test git

   //test is good
        

        for(int i=0; i<b.length; i++) {
            System.out.println(b[i]); //retrieve values present in that array
        }


    }
}
