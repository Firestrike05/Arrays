import java.util.Random;
public class Duplicates {
    public static void main(String[] args) {
        int [] array1 = new int[20]; //initialise array1
        int [] array2 = new int[20]; //initialise array2
        for(int i = 0; i < array1.length; i++) //setting random numbers to array1
        {   Random rand = new Random();
            int num = rand.nextInt(20) + 1;
            array1[i] = num;
            System.out.print(" " + array1[i]);
        }   for(int j = 0; j < array2.length; j++) //setting random numbers to array2
        {   Random rand1 = new Random();
            int num = rand1.nextInt(20) + 1;
            array2[j] = num;
            System.out.print(" " + array2[j]);
        }  System.out.println("");
        System.out.println("The following numbers are duplicates:");

        for(int i = 0; i < array1.length; i++) {
          for(int j = 0; j < array2.length; j++) {
            if(array1[i] == array2[j]){         //comparing both arrays to find duplicate numbers
                System.out.println(array1[i]);  //printing all duplicate values
                }
             }

         }

    }
 }


