import java.util.Arrays;

public class Main {
    public static int[] list;

    public static void main(String[] args) {
        sort(new int[] {2, 9, 3, 2, 0, 5, 2, 0, 8, 1});
    }

    public static int[] sort(int[] given_list) {
        list = given_list;
        int n = list.length;
        boolean swapped;

        System.out.printf("Before bubble-sort: %s\n", Arrays.toString(list));

        do {
            swapped = false;

            for (int i = 0; i < n-1; i++)
            {
                if (list[i] > list[i + 1])
                {
                    swapInArray(i, i + 1, list);
                    swapped = true;
                }
            }

        } while (swapped);

        System.out.printf("After bubble-sort:  %s", Arrays.toString(list));

        return list;
    }

    private static void swapInArray(int x, int y, int[] list) {
        int temp = list[x];
        list[x] = list[y];
        list[y] = temp;
    }
}