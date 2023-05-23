public class TestArray {
    public static void main(String[] args) {

        int sum = 0; //initialise sum
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //initialise array

        for (int i = 0; i < numbers.length; i++) //for loop to interate through array
        {
            sum += numbers[i]; //adds sum and i together
        }
        System.out.println("Total sum is " + sum);
        double average = (double) sum / numbers.length; //divides sum by the length of array
        System.out.println("Average is " + average);

    }
}
