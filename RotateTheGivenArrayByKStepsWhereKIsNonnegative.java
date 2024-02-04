package BasicJavaProgram;

public class RotateTheGivenArrayByKStepsWhereKIsNonnegative {

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] rotate(int arr[], int k) {
        int n = arr.length; // Fix: Set the value of n to the length of the array
        k = k % n;
        int ans[] = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        System.out.println("Original Array :");
        printArray(arr);

        int ans[] = rotate(arr, k);
        System.out.println("\nArray After Rotation Element : ");
        printArray(ans);
    }
}
