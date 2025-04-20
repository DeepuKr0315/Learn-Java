package Array.arraylist;

import java.util.*;

public class UserInputArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers (type -1 to stop):");
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            list.add(num);
        }

        System.out.println("You entered: " + list);
        sc.close();
    }
}
