package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicInputList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter integers (enter -1 to stop): ");
        while (true){
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            list.add(num);
        }
        System.out.println("You entered: "+ list);
        sc.close();
    }
}
