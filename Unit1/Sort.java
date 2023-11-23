import java.util.*;
public class Sort {

    static void sort(int[] arr) 
    {
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    Sort.swap(arr,j,j+1);
                }
            }
        }
    }
    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];

        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            list[i] = sc.nextInt();
        }
        System.out.println("List before sorting: ");
        System.out.println(Arrays.toString(list));

        sort(list);

        System.out.println("List aster sorting: ");
        System.out.println(Arrays.toString(list));
        sc.close();
    }
}
