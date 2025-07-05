package Hash_Map;

import java.util.HashSet;
import java.util.*;

public class Two_Sum_1 {

    public static int[] two_sum(int[] arr, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> store = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int diff = target - arr[i];
            if(store.containsKey(diff)){
                return new int[]{store.get(diff), i};
            }
            store.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Start entering element: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(two_sum(arr, target)));
    }
}
