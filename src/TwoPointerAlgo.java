public class TwoPointerAlgo {
    public static void main(String[] args) {

        int arr [] = {3, 5, 9, 2, 8, 10, 11};
        int value = 17;
        int size = arr.length;
        System.out.println(pairSum(arr, size, value));
    }


    public static int pairSum(int[] a, int N, int x) {
        int i = 0;
        int j = N - 1;
        while (i < j) {
            if (a[i] + a[j] == x) {
                return 1;
            } else if (a[i] + a[j] < x) {
                i++;

            } else j--;
        }
        return 0;

    }
}
