package JavaArray;

public class testArray1 
{
    public static void min(int arr[]) //creating a method which receive an array as a parameter 
    {
        if (arr == null || arr.length == 0) 
        {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (min > arr[i]) 
            {
                min = arr[i];
            }
        }
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args) {
        int a[] = {23, 56, 17, 87, 45}; //declaring and initializing an array
        min(a);  //passing aaray to method
    }
}

