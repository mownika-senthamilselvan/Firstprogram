package practise;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 8, 9};
        int target = 5;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target)
            {
                System.out.println(mid);
            }
            else
            {
                end = mid - 1;
            }

        }
        System.out.println(start);
    }
}
