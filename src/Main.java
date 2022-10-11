public class Main {
    public static void main(String[] args) {
        //task1.1
        int [] array = new int [3];
        for (int i=0; i<array.length ; i++) {
            array[i]=i+1;
            System.out.print(array[i]+" ");
        }

        //task1.2

        System.out.println();
        double [] array1 = {1.57, 7.654, 9.986};
        System.out.println(array1[0]);
        System.out.println(array1[1]);
        System.out.println(array1[2]);

        //task1.3

        System.out.println();
        double [] array2 = {2.57, 5.654, 9};
        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);


        //task2
        for (int k=0; k<array.length; k++) {
            System.out.print(array[k] + ", ");
        }
        System.out.println();
        for (int k=0; k<array1.length; k++) {
            System.out.print(array1[k]+", ");
        }
        System.out.println();
        for (int m=0; m<array2.length; m++) {
            System.out.print(array2[m]+", ");
        }
        System.out.println();

        //task3
        for (int k=array1.length-1; k>=0; k--) {
            System.out.print(array[k] + ", ");
        }
        System.out.println();
        for (int k=array1.length-1; k>=0; k--) {
            System.out.print(array1[k]+", ");
        }
        System.out.println();
        for (int k=array2.length-1; k>=0; k--) {
            System.out.print(array2[k]+", ");
        }
        System.out.println();


        //task4


        for (int i=0; i<array.length; i++) {
            if (array[i]%2 != 0) {
                array[i]+=1;
            }
                System.out.println(" в массиве array["+i + "] число " + array[i]);

        }
    }
}