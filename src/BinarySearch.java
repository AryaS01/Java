import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = new int[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements in array:");
        int n=sc.nextInt();
        System.out.println("Enter your array elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc.nextInt();
        int result = binarySearch(ar, key);
        if (result == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at: " + result);
        }
    }

    public static int binarySearch(int ar[], int key) {
        int left = 0;
        int right = ar.length-1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ar[mid] == key) {
                return mid;
            }
            else if (mid < key) {
                left = mid + 1;
            }
            else {
                right = mid - 1;

            }
        }
       return -1;
    }
}


