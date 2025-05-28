// problem link = https://leetcode.com/problems/boats-to-save-people/description/

package Two_Pointers;

import java.util.Arrays;

public class Boats_to_save_people {
    public static int numRescueBoats(int[] people, int limit){
        int res = 0;
        int start = 0;
        int end = people.length - 1;
        Arrays.sort(people);
        while (start <= end){
            if (people[start] + people[end] <= limit){
                start += 1;
            }
            res += 1;
            end -= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        System.out.println(numRescueBoats(people, limit));
    }
}
