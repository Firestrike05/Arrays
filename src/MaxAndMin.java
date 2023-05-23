import java.util.Random;

public class MaxAndMin {

    public static void main(String args[]) {
        int random[] = new int[10];
        for (int i = 0; i < random.length; i++)
        {
            Random rand = new Random();
            int num = rand.nextInt(10) + 1;
            random[i] = num;
            System.out.println(num);
        }
        int max = random[0];
        int min = random[0];
        for(int i = 1; i < random.length; i++) {
            if(random[i] < min)
            {  min = random[i];
            }
            if (random[i] > max) {
                max = random[i]; }
                            }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);
    }
}

