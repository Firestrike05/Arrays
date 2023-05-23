import java.util.Scanner;
public class ExistInArray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //creates array
        Scanner reader = new Scanner(System.in); //create scanner
        System.out.println("Enter a number: ");

        int user = Integer.parseInt(reader.nextLine()); //takes input from user

        boolean found = false;
        for (int i = 0; i <array.length; i++){
            if (array[i] == user){
                found = true;
                System.out.println("Value " + array[user] + " found in array");
            }
        } if (found == false) {
            System.out.println("Value was not found in array");
        }

    }
}
