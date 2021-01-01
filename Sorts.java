import java.util.*;

public class Sorts {
    /**Bubble sort of an int array.
     *@postcondition The array will be modified such that the elements will be in increasing order.
     *@param data  the elements to be sorted.
     */
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
        //String answer = Arrays.toString(data);
        //System.out.println(answer);
    }

    public static void selectionSort(int[] data) {
        int x = 0;
        int i = x;
        int min = Integer.MAX_VALUE;
        int pos = 0;
        int hold = 0;
        while (x < data.length) {
            while (i < data.length) {
                if (data[i] < min) {
                    min = data[i];
                    pos = i;
                    i++;
                } else {
                    i++;
                }
            }
            i = pos;
            hold = min;
            data[i] = data[x];
            data[x] = hold;
            x++;
            i = x;
            min = Integer.MAX_VALUE;
        }
        //String answer = Arrays.toString(data);
        //System.out.println(answer);
    }

    public static void insertionSort(int[] data) {
        for (int i = 1; i < data.length; ++i) {
            int sorted = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > sorted) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = sorted;
        }
//        String answer = Arrays.toString(data);
//        System.out.println(answer);
    }
}

//class Tester {
//    public static void main(String[] args) {
//        Random len = new Random();
//        int x = len.nextInt(10);
//        int[] test1 = new int[x];
//        Random place = new Random();
//        for(int i = 0; i < test1.length; i++) {
//            test1[i] = place.nextInt(100000);
//        }
//        int arr[] = new int[10];
//        arr[0] = (int)(Math.random() * 10000);
//        for (int i = 1; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * arr[i - 1]);
//        }
//        String answer1 = Arrays.toString(test1);
//        System.out.println(answer1);
//        Sorts.bubbleSort(test1);
//        Sorts.selectionSort(test1);
//        Sorts.insertionSort(test1);
//        String answer2 = Arrays.toString(arr);
//        System.out.println(answer2);
//        Sorts.bubbleSort(arr);
//        Sorts.selectionSort(arr);
//        Sorts.insertionSort(arr);
//    }
//}
