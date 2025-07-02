package Dynamic_Programming;

import java.util.Scanner;

public class Longest_Palindromic_Substring {
    public static String expand(String s, int left, int right){
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left -= 1;
            right += 1;
        }
        return s.substring(left + 1, right);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String p1 = expand(s, i, i);
            String p2 = expand(s, i, i + 1);
            if (p1.length() > longest.length()){
                longest = p1;
            }
            if (p2.length() > longest.length()){
                longest = p2;
            }
        }
        System.out.println(longest);
    }
}
