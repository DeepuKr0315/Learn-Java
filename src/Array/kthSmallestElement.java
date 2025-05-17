package Array;

public class kthSmallestElement {
    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = arr.length - 1;
        while(i <= j){
            while(i <= j && arr[i] <= pivot) i++;
            while(j > low && arr[j] >= pivot) j--;
            if(arr[i] > arr[j]){
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = partition(arr, left, right);
            if(mid == k - 1){
                System.out.println("Found 3rd smallest element in array: " + arr[mid]);
                return;
            }else if(mid < k - 1){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        System.out.println("Invalid value of k");
    }
}
