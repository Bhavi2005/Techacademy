package Pack1;

import java.util.Scanner;

public class Lab10 {

    public static boolean isPositiveString(String str) {
        str = str.toLowerCase(); 
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= str.charAt(i + 1)) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String s = sc.nextLine();
        System.out.println(isPositiveString(s));
    }
}
