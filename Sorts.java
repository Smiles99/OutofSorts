import java.util.Random;
import java.util.Arrays;

public class Sorts {
    public static void bubbleSort(int[] data) {
        int x = 0;
        int y = 1;
        int z = data.length;
        int hold = 0;
        while (z > 1) {
            while (y < z) {
                if (data[x] > data[y]) {
                    hold = data[y];
                    data[y] = data[x];
                    data[x] = hold;
                    x++;
                    y++;
                } else {
                    x++;
                    y++;
                }
            }
            x = 0;
            y = 1;
            z--;
        }
        String answer = Arrays.toString(data);
        System.out.print(answer);
    }
}

class Tester {
    public static void main(String[] args) {
        Random len = new Random();
        int x = len.nextInt(100);
        int[] test1 = new int[x];
        Random place = new Random();
        for(int i = 0; i < test1.length; i++) {
            test1[i] = place.nextInt(100);
        }
        String answer1 = Arrays.toString(test1);
        System.out.println(answer1);
        Sorts.bubbleSort(test1);
    }
}
