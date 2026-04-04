import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] myArray = new int[n];

        for(int i = 0; i < n; i++){
            myArray[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }

        Arrays.sort(myArray);
        double average = (double) sum / n;
        System.out.println(Arrays.toString(myArray));
        System.out.println(sum);
        System.out.println(average);

        sc.close();
    }
}
