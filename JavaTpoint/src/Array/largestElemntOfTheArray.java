package Array;
public class largestElemntOfTheArray {
//    static void display(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    static int findLargestNumber(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int findSecondLargestNumber(int arr[]) {
        int max = findLargestNumber(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findLargestNumber(arr);
    }

    static int findThirdLargestNumber(int arr[]) {
        int firstMax = findLargestNumber(arr);
        int secondMax = findSecondLargestNumber(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstMax || arr[i] == secondMax) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        return findLargestNumber(arr);
    }
    
   // static int findSmallest(int arr[]) {
    //  int min = Integer.MAX_VALUE;
    //  for (int i = 0; i < arr.length; i++) {
//          if (arr[i] < min) {
//              min = arr[i];
//          }
    //  }
    //  return min;
    //}

    public static void main(String[] args) {
        int arr[] = new int[]{25, 11, 7, 75, 56};

        System.out.println("\nLargest Number: " + findLargestNumber(arr));
        System.out.println("Second Largest Number: " + findSecondLargestNumber(arr));
        System.out.println("Third Largest Number : " + findThirdLargestNumber(arr));
       // System.out.println("Smallest Number : " + findSmallest(arr));
    }
}
