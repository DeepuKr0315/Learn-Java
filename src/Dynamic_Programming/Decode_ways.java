package Dynamic_Programming;

import java.util.Scanner;

public class Decode_ways {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    }
    public static int helper(String s, int idx){
        if (idx == s.length()) return 1;
        if (s.charAt(idx) == '0') return 0;
        int ways = helper(s, idx + 1);
        if(idx + 1 < s.length()){
            int num = Integer.parseInt(s);
            if(idx <= 26){
                ways += helper(s, idx + 2);
            }
        }
        return ways;
    }
}
