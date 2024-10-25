public class Reverse {

    static int[] sampleInput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    static void arrayReverse(int[] arr) {
        int left = 0;
        int right  = arr.length - 1;
        int temp;

        while (left < right) {
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    static void printElements(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        printElements(sampleInput);
        arrayReverse(sampleInput);
        printElements(sampleInput);
    }
}