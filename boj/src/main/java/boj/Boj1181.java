package boj;

import java.util.*;

public class Boj1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> que = new LinkedList<>();

        int n = sc.nextInt();
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });

        

    }
}
